<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보</title>
</head>
<body>
	
	<table border="1">
		<tr>
			<td>id</td>
			<td>${result.id }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${result.name }</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>${result.email }</td>
		</tr>
		<tr>
			<td>자기소개</td>
			<td>${result.introduce }</td>	
		</tr>
	</table>

</body>
</html>