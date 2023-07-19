<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 리스트</title>
</head>
<body>

	<h1>사용자 리스트 </h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>이메일</th>
				<th>자기소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${userList }">
			<tr>
				<td>${user.name }</td>
				<td>${user.email }</td>
				<td>${user.introduce }</td>
			</tr>
			</c:forEach>
			
		</tbody>
	
	</table>

</body>
</html>