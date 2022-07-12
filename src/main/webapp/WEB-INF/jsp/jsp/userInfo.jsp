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
			<td>이름</td>
			<td>${result.name}</td>
		</tr>
		
		<tr>
			<td>생년월일</td>
			<td>${result.yyyymmdd }</td>
		</tr>
		
		<tr>
			<td>이메일</td>
			<td>${result.email }</td>
		</tr>
	
	
	</table>

</body>
</html>