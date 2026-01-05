<%@ tag description="num factorial" pageEncoding="UTF-8"%>
  <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ attribute name="num" required="true" type="java.lang.Integer"%>
  <core:foreach var="i" begin="1" end="${num}">
  <core:set var="fact" value="${fact*i}"></core:set>
  </core:foreach>
  Result:<core:out value="${fact}"></core:out>