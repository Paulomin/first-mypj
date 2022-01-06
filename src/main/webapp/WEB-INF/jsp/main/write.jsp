<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OSC Write</title>
<link rel="shortcut icon" type="image/x-icon" href="/static/icons/favicon.ico" sizes="48x48">
<link type="text/css" rel="stylesheet" href="/static/css/style.css">
<link type="text/css" rel="stylesheet" href="/static/css/board/write.css">
</head>
<body>
	
		<div class="text-area">
		<form action="./write" method="post" enctype="multipart/form-data">
			<div>
				<label for="text-title">제목</label>
				<input type="text" id="text-title" name="c-title" placeholder="제목" required>
			</div>
			<div>
				<label for="text-title">가격(리셀가)</label>
				<input type="text" id="text-resell" name="c-resell" placeholder="가격(리셀가)">
			</div>
			<div>
				<label>내용</label>
				<textarea id="text-contents" name="c-contents" rows="" cols="" placeholder="내용을 입력하세요..."></textarea>
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