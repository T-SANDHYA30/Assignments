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
<c:set var="name" value="sandhya"></c:set>
<c:out value="${name}"></c:out>
<C:if test="${name == 'sandhya' }">
<h1>Name is sandhya</h1>
</C:if>

</body>
</html>