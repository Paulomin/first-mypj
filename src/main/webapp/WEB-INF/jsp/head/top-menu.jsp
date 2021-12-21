<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%
	boolean logined = false;

	if(session.getAttribute("logined") != null) {
		logined = (boolean)session.getAttribute("logined");
	}

%>

<link type="text/css" rel="stylesheet" href="/static/css/main/topMenu.css">

<header class="top-menu-header">
      <!-- 로고자리 -->
      <span class="site-logo"><a href="/main">OSC</a></span>
      <ul class="menu-list">
        <li class="menu-contents"><a href="#" class="list-a">Home</a></li>
        <li class="menu-contents"><a href="#" class="list-a">Features</a></li>
        <li class="menu-contents"><a href="#" class="list-a">Pricing</a></li>
        <li class="menu-contents"><a href="#" class="list-a">FAQs</a></li>
        <li class="menu-contents"><a href="#" class="list-a">About</a></li>
      </ul>

      <div class="btn-area">
      	<% if(logined) { %>
         	<button type="button" class="btn-style"><a href="/login">Login</a></button>
         	<button type="button" class="btn-style"><a href="/sign">Sign-up</a></button>
        <%} else { %>
        	<button type="button" class="btn-style"><a href="/logout">Logout</a></button>
         	<button type="button" class="btn-style"><a href="/info">MyInfo</a></button>
        <%} %>
      </div>
</header>