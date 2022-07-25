<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저추가</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
</head>
<body>
	<!-- <form method="post" action="/ajax/user/insert" id="userForm">  -->
		<label>이름 </label> <input type="text" name="name" id="nameInput"> <button type="button" id="duplicateBtn">중복확인</button> <br>
		<label>생년월일</label> <input type="text" name="birthday" id="birthInput"> <br>
		<label>자기소개</label> <br>
		<textarea rows="5" cols="30" name="introduce" id="introduceInput"></textarea> <br>
		<label>이메일</label> <input type="text" name="email" id="emailInput"> <br>
		<button type="button" id="addBtn">추가</button>
	<!--  </form>  -->
	
	<script>
		$(document).ready(function() {
			
			$("#duplicateBtn").on("click", function() {
				// 이름 인풋에 입력한 이름이 중복인지 확인
				let name = $("#nameInput").val();
				if(name == "") {
					alert("이름을 입력하세요");
					return false;
				}
				
				$.ajax({
					type:"get",
					url:"/ajax/user/is_duplicate",
					data:{"name": name},
					success:function(data) {
						// is_duplicate : true
						// is_duplicate : false
						if(data.is_duplicate) {  // 중복된 상황
							alert("중복된 이름 입니다");
						} else {
							alert("사용가능한 이름입니다.");
						}
						
					},
					error:function() {
						alert("에러 발생!!");
					}
				});
				
				
			});
			
			
			$("#addBtn").on("click", function() {
				
				let name = $("#nameInput").val();
				let birthday = $("#birthInput").val();
				let introduce = $("#introduceInput").val();
				let email = $("#emailInput").val();
				
				if(name == "") {
					alert("이름을 입력하세요");
					return false;
				}
				
				if(birthday == "") {
					alert("생년월일을 입력하세요");
					return false;
				}
				
				if(introduce == "") {
					alert("자기소개를 입력하세요");
					return false;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요");
					return false;
				}
				
				$.ajax({
					// 리퀘스트를 위한 옵션
					type:"post",
					url:"/ajax/user/insert",
					data:{"name":name, "birthday":birthday, "introduce":introduce, "email":email},
					// 리스펀스를 위한 옵션
					success:function(data) {
						//alert(data);
						// {"result":"success"}
						// {"result":"fail"}
						
						// 만약에 성공했으면 리스트로 이동
						if(data.result == "success") {
							location.href = "/ajax/user/list";
						} else {
						// 실패 했으면 얼럿띄우기 
							alert("삽입실패!!");	
						}
						
					},
					error:function() {
						
						alert("에러발생");
					}
				});
				
			});
			
			
			/*
			$("#userForm").on("submit", function() {
				let name = $("#nameInput").val();
				let birthday = $("#birthInput").val();
				let introduce = $("#introduceInput").val();
				let email = $("#emailInput").val();
				
				if(name == "") {
					alert("이름을 입력하세요");
					return false;
				}
				
				if(birthday == "") {
					alert("생년월일을 입력하세요");
					return false;
				}
				
				if(introduce == "") {
					alert("자기소개를 입력하세요");
					return false;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요");
					return false;
				}
				
			});
			*/
			
			
		});
	
	
	</script>
	
	
</body>
</html>