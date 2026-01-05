<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Employee Name:<%=request.getParameter("ename")%></h3>
<h3>Employee Id  :<%=request.getParameter("eid") %></h3>
<h3>Employee Desg:<%=request.getParameter("desg") %></h3>
<h3>Company Name:<%=request.getParameter("cname")%></h3>
<h3>Address:</h4><%=application.getAttribute("address")%></h4>


</body>
</html>