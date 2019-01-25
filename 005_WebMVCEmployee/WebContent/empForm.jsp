<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>empForm.jsp</title>
</head>
<body>
<!--
	private int empId;
	private String empName;
	private double empSal;

 -->
 <h1>Employee Form</h1>
 <form action="EmployeeController" method="post">
 Employee Name :<input type="text" name="empName"><br>
 Employee Salary: <input type="text" name="empsal"><br>
 <input type="submit" value="Add Employee record">
 </form>
</body>
</html>