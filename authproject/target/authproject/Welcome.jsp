<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String uname = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null)
		for (Cookie c : cookies)
			if ("user".equals(c.getName()))
		uname = c.getValue();
	        if(uname==null)
	        	response.sendRedirect("Error.jsp");
	%>
	<h1>
		welcome
		<%=uname%>
	</h1>
</body>
</html>