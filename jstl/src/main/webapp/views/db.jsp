<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="Database connectivity"></c:out>
<sql:setDataSource var="ds"
driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/ass2"
uname="root"
password=""/>
<sql:update var="rs datasource"="${ds}">
select * from employees;
</sql:update>
<c:forEach var="row" items="${ds}">
Employee Id:<c:out value="${item.employeeNumber}"></c:out><br>
Employee Lname:<c:out value="${item.lastName}"></c:out><br>
Employee Fname:<c:out value="${item.firstName}"></c:out><br>
</c:forEach>
<sql:transaction>
<sql:update var="insert" dataSource="${ds}">
insert into employees(employeeNumber,lastName,firstName)
(200,'sandhyaa','thummaluru')
</sql:update>
</sql:transaction>
<c:out value="${insert }"></c:out>
</body>
</html>