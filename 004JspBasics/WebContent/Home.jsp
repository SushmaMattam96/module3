<%@page import="java.time.LocalDate" %>
<%@include file="header.jsp" %>
<%--Directives which will provide information about the jsp to be compiled --%>
<hr>
<jsp:include page="clock.jsp"></jsp:include>
<hr>
<a href="login.jsp">Login</a>
<hr>
<%out.println("This is Jsp Scriplets..used to write java code within Jsp : " + LocalDate.now()); %>

<%! int age=22; %>
<hr>

<% if(age>=18) { %>
<p style="color:green"><%= age+ " Years Eligible" %></p>
<%}
else { %>
<p style="color: red"><%=age +"Years is not Eligible" %></p>
<%} %>
<jsp:include page="footer.jsp"></jsp:include>
