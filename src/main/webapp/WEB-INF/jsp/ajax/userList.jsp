<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저리스트</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<th>이름</th>
				<th>생년월일</th>
				<th>자기소개</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="user" items="${userList }" >
			<tr>
				<td>${user.name }</td>
				<td>${user.yyyymmdd }</td>
				<td>${user.introduce }</td>
				<td>${user.email }</td>
			</tr>
		</c:forEach>
		
		</tbody>
	
	</table>

</body>
</html>