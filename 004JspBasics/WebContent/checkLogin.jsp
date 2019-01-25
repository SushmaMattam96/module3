<%
String strUser=request.getParameter("username");
session.setAttribute("sessionUser",strUser);
if(strUser.equals("")||strUser.equals(null)) { %>
<jsp:forward page="errorpage.jsp"></jsp:forward>
<%}else{%>
<jsp:include page="welcome.jsp"></jsp:include>
<%}%>
<a href="Home.jsp">Logout</a>