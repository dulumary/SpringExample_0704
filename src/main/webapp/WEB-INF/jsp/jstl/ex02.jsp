<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 라이브러리</title>
</head>
<body>


	<h2> 조건문 if - else if </h2>
	
	<%-- 70이하면, 치킨 80이하면 샐러드 그게아니면 굶어! --%>
	<%-- int weight = 78; --%>
	<c:set var="weight" value="78" />
	
	<c:choose>
	<%-- if(weight <= 70)  --%>
		<c:when test="${weight <= 70 }">
			<h3>치킨먹자</h3>
		</c:when>
	<%--else if(weight <= 80)  --%>
		<c:when test="${weight <= 80 }">
			<h3>샐러드 먹자</h3>
		</c:when>
	<%-- else  --%>
		<c:otherwise>
			<h3>굶어!</h3>
		</c:otherwise>
	
	</c:choose>
	
	
	<h2> 반복문 </h2>
	<%-- 0~ 4까지 출력 --%>
	<%-- for(int i = 0; i < 5; i++) --%>
	<c:forEach var="i" begin="0" end="4" step="1">
		${i } 
	</c:forEach>
	<br>
	<%-- 16 ~ 20 --%>
	<c:forEach var="i" begin="16" end="20" step="1" varStatus="status">
		${i } ${status.current } ${status.first } ${status.last } ${status.count } ${status.index } <br>
	</c:forEach>
	
	
	<hr>
	
	<h2>model에 리스트 반복문으로 출력</h2>
	<%-- for(String fruit : data) --%>
	<c:forEach var="fruit" items="${data }" varStatus="status">
		<h4>${fruit } ${status.count } ${status.index } </h4>
	</c:forEach>
	
	<hr>
	<%-- for(User user : userList) --%>
	<c:forEach var="user" items="${userList }" >
		<h4>${user.name }  ${user.yyyymmdd } ${user.email }</h4>
	</c:forEach>
	
	
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>생년월일</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${userList }" varStatus="status">
			<tr>	
				<td>${status.count }</td>
				<td>${user.name }</td>
				<td>${user.yyyymmdd }</td>
				<td>${user.email }</td>
			</tr>
			
			</c:forEach>
		
		</tbody>
		
	
	
	</table>
	



</body>
</html>