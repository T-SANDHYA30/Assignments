<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="num1" value="${param.num1}"></c:set>
<c:set var="num2" value="${param.num2}"></c:set>
<c:set var="op" value="${param.op}"></c:set>
<%--<c:out value="${num1}"></c:out>
<c:out value="${num2}"></c:out>
<c:out value="${op}"></c:out>--%>

<%--<c:set var="a" value="${num1+0 }"></c:set>
<c:set var="b" value="${num2+0 }"></c:set>--%>

<fmt:parseNumbet var="a" value="${num1 }"></fmt:parseNumbet>
<fmt:parseNumbet var="b" value="${num2 }"></fmt:parseNumbet>
<c:choose>
<c:when test="${op=='+' }">
<c:out value="${a+b}"></c:out>
</c:when>
<c:when test="${op=='-' }">
<c:out value="${a-b}"></c:out>
</c:when>
<c:when test="${op=='*' }">
<c:out value="${a*b}"></c:out>
</c:when>
<c:when test="${op=='/' }">
<c:out value="${a/b}"></c:out>
</c:when>
<c:otherwise>invalid operations</c:otherwise>
</c:choose>
</body>
</html>