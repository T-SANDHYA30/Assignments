<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--<c:set var="uname" value="${param.uname}"></c:set>
<c:set var="pwd" value="${param.pwd}"></c:set>
<c:choose>
<c:when test="${uname=='sandhya'&&pwd=='swapna' }">
<c:redirect url="success.jsp">--%>







>c:if test="${uname=='swapna' && pwd=='sandhya'}">
<h1>Authentication successfull</h1>
<c:redirect url="success.jsp"></c:redirect>

<%--<%response.sendRedirect("success.jsp?uname="+uname);
</c:if>--%>
<%-- <c:if test="${uname!='swapna' && pwd!='sandhya'}">
<h1>invalid credentials</h1>
</c:if>--%>
</body>
</html>