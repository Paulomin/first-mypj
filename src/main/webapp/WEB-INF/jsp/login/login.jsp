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
	 	<div class="login-area_box">
	 		<input class="login-input" type="text" name="user-id" placeholder="아이디">
	 		<input class="login-input" type="password" name="user-pw" placeholder="비밀번호">
	 		<button class="login-input" type="button">로그인</button>
		</div>
	</div>
</body>
</html>