package com.cg.ma.utility;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.ma.exceptions.EmployeeException;

public class JdbcUtility {

	static Connection connection = null;

	public static Connection getConnection() throws EmployeeException {

		File file = null;
		FileInputStream inputStream = null;
		Properties properties = null;

		file = new File("resources/Jdbc.properties");
		try {
			inputStream = new FileInputStream(file);

			properties = new Properties();
			properties.load(inputStream);

			String driver = properties.getProperty("db.driver");
			String url = properties.getProperty("db.url");
			String username = properties.getProperty("db.username");
			String password = properties.getProperty("db.password");
			try{
			Class.forName(driver);
			}catch(ClassNotFoundException e)
			{
				System.out.println(e.getStackTrace());
				throw new EmployeeException("Driver wasn't loaded..");
			}
			try{
			connection = DriverManager.getConnection(url, username, password);
			}catch(SQLException e)
			{
				throw new EmployeeException("Conection is not closed");
			}

		} catch (FileNotFoundException e) {
			throw new EmployeeException("File not exist");
		} catch (IOException e) {
			throw new EmployeeException("unable to read the file");
		}
		return connection;
	}
	public static void main() throws EmployeeException  {
		Connection con=JdbcUtility.getConnection();
		if(con!=null)
		{
			System.out.println("Connection obtained");
		}else {
			System.out.println("Connection is not obtained");
		}

	}
}
