<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><!-- 신발제목받아서 작성하기 --></title>
<link rel="shortcut icon" type="image/x-icon" href="/static/icons/favicon.ico" sizes="48x48">
<link type="text/css" rel="stylesheet" href="/static/css/style.css">
<link type="text/css" rel="stylesheet" href="/static/css/board/boardPost.css">
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/head/top-menu.jsp" flush="false" />
	
	
	<div class="text-area">
		<form action="" method="post">
			<div>
				<label for="text-title">제목</label>
				<input type="text" id="text-title" name="c-title" placeholder="제목" required>
			</div>
			<div>
				<label>내용</label>
				<textarea rows="" cols=""></textarea>
			</div>
			<div>
				<label for="text-file">파일선택</label>
				<input type="file" id="text-file" name="c-file" accept="image/*">
			</div>
			<div>
				<button type="submit">글등록</button>
			</div>
		</form>
	</div>
</body>
</html>