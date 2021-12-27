<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OSC Login</title>
<link type="text/css" rel="stylesheet" href="/static/css/style.css">
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/head/top-menu.jsp" flush="false" />
	
	<div class="login-area">
	<form action="/login" method="post">
	 	<div class="login-area_box">
	 		<span class="login_text">로그인</span>
	 		<%
	 			if(request.getAttribute("fail") != null) {
	 		%>
	 		<div class="must-input">
	 			<%= (String) request.getAttribute("fail") %>
	 		</div>
	 		<%
	 			}
	 		%>
	 		<input class="login-input login-input2" type="text" name="user-id" placeholder="OSC 아이디" required>
	 		<input class="login-input login-input2" type="password" name="user-pw" placeholder="비밀번호" required>
	 		<button class="login-input login_btn" type="submit">로그인</button>
		</div>
	</form>
	</div>
<script type="text/javascript" src="static/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" rel="javascript" src="/static/js/login.js"></script>
</body>
</html>