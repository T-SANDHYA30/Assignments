<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentication Verified</title>
</head>
<body>
	<%-- 
	String uname = null;
	Cookie[] cookies = request.getCookies();
	if (cookies != null)
		for (Cookie c : cookies)
			if ("user".equals(c.getName()))
		uname = c.getValue();
	        if(uname==null)
	        	response.sendRedirect("Error.jsp");
	--%>
	
	<%--
	/*url rewritting*/
	String uname=request.getParameter("uname");
	   if(uname==null)
	   response.sendRedirect("Error.jsp");
	  --%>
	  
	  <% 
	  /* http method*/
	  String user=(String)session.getAttribute("uname");
	  String token=(String)session.getAttribute("token");
	  if(token==null){
	  RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
	  rd.forward(request,response);
	  }
	  %>
	  <script>
	  sessionStorage.setItem("token,<%=session.getAttribute("token")%>)</script>
	   <h1> Welcome <%= user %> </h1>
</body>
</html>