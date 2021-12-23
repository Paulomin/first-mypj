<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OSC 회원가입</title>
<link rel="shortcut icon" type="image/x-icon" href="/static/icons/favicon.ico" sizes="48x48">
<link type="text/css" rel="stylesheet" href="/static/css/style.css">
</head>
<body class="sign-body">
	<div class="sign-header-area">
		<span class="sign-header-text"><a href="/main">O S C</a></span>
	</div>
	<div class="sign-main">
		<form action="/sign" method="post">
			<div class="sign-main-area">
				<label for="user_id">아이디</label>
				<input type="text" id="user_id" class="sign-input" placeholder="아이디" required>
				<div class="warning-message">
					<!-- 경고메시지 -->
				</div>
			</div>
			<div class="sign-main-area">
				<label for="user_id">비밀번호</label>
				<input type="password" id="user_pw" class="sign-input" placeholder="비밀번호" required>
				<div class="warning-message">
					<!-- 경고메시지 -->
				</div>
			</div>
			<div class="sign-main-area">
				<label for="user_id_pw_ck">비밀번호 확인</label>
				<input type="text" id="user_pw_ck" class="sign-input" placeholder="비밀번호 확인" required>
				<div class="warning-message">
					<!-- 경고메시지 -->
				</div>
			</div>
			<div class="sign-main-area">
				<label for="user_name">이름</label>
				<input type="text" id="user_name" class="sign-input" placeholder="이름" required>
				<div class="warning-message">
					<!-- 경고메시지 -->
				</div>
			</div>
			<div class="sign-main-area">
				<label for="user_email">이메일</label>
				<input type="text" id="user_email" class="sign-input" placeholder="이메일" required>
				<div class="warning-message">
					<!-- 경고메시지 -->
				</div>
			</div>
			<div class="sign-main-area">
				<label for="user_phoneNum">연락처</label>
				<input type="text" id="user_phoneNum" class="sign-input" placeholder="연락처" required>
				<div class="warning-message">
					<!-- 경고메시지 -->
				</div>
			</div>
			<div class="sign-main-btn">
				<button type="submit" class="sign-btn">가입하기</button>
			</div>
		</form>
	</div>
</body>
</html>