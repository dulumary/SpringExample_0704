<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 함수 라이브러리</title>
</head>
<body>

	<h2>JSTL 함수 라이브러리</h2>
	
	<c:set var="string1" value="No pain. No gain." />
	
	<h3>문자열 길이</h3>
	<h4>길이 : ${fn:length(string1) } </h4>
	
	<h3>특정 문자열이 존재하는지 여부 </h3>
	<h4>No가 존재하는지? ${fn:contains(string1, "No") }</h4>
	
	<h3>특정 문자열로 시작, 끝나는지 확인</h3>
	<h4>No로 시작하는지? ${fn:startsWith(string1, "No") } </h4>
	<h4>gain.으로 끝나는지? ${fn:endsWith(string1, "gain.") } </h4>

	<c:set var="string2" value="I love chicken" />
	
	<h3>문자열 치환</h3>
	<h4>${fn:replace(string2, "chicken", "bread") }</h4>
	<h4>${string2 }</h4>
	
	<h3>문자열 자르기</h3>
	<h4>${fn:substring(string2, 2, 6) }</h4>
	
	<h3>문자열 쪼개기</h3>
	<h4>${fn:split(string2, " ")[2] }</h4>
	
	<h3>문자열 앞뒤 공백 제거</h3>
	<c:set var="string3" value="       hello      " />
	<textarea>${string3 }</textarea>
	<textarea>${fn:trim(string3) }</textarea>
	

</body>
</html>