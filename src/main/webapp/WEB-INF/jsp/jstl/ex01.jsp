<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리</title>
</head>
<body>

	<h2>변수 정의하기</h2>
	<c:set var="number1" value="100" />
	<c:set var="number2">200</c:set>
	
	<h4>number1 : ${number1 }</h4>
	<h4>number2 : ${number2 }</h4>
	
	<h2>출력하기</h2>
	<h4> <c:out value="10" /> </h4>

	<c:out value="<script>alert('첫번째 얼럿')</script>" />
	
	<%--	
		<c:out value="<script>alert('두번째 얼럿')</script>" escapeXml="false" />
	 --%>
	 
	 <h2>조건문 (c:if)</h2>
	 
	 <c:if test="true">
	 	<h4>조건이 참이다!!</h4>
	 </c:if>
	 
	 <c:if test="${number1 > 50 }">
	 	<h3>number1이 50보다 크다</h3>
	 </c:if>
	 
	 <c:if test="${number1 == 100 }">
	 	<h3>number1이 100이다</h3>
	 </c:if>
	 
	 <c:if test="${number1 eq 100 }">
	 	<h3>number1이 100이다</h3>
	 </c:if>
	 
	 <c:if test="${number1 ne 200 }">
	 	<h3>number1이 200이 아니다.</h3>
	 </c:if>
	 
	 <c:if test="${!empty number1 }">
	 	<h3>number1 이 있다</h3>
	 </c:if>
	 
	 <c:if test="${not empty number1 }">
	 	<h3>number1 이 있다</h3>
	 </c:if>
	
	
	
	

</body>
</html>