<%@page session="true"%>
<h1> Hello Again , ${param.username}</h1><hr>

<hr>
<h1>Cookie</h1>
<% 
Cookie[]cookies=request.getCookies();
for(Cookie c:cookies){
out.println("Cookie is: " +c.getName() + c.getValue()+"\t");
}

%>
Your session Id:<%=session.getId()%>
<h1>Hello again by cookie ${session.username }</h1><br>
<h1>Helo again cookie ${session.username } and password : ${session.password}</h1><br>
<%session.setMaxInactiveInterval(5); %>
<a href="logout.jsp">Logout</a>
<hr>                                