package com.web.sbMain.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.sbMain.model.*;

@WebServlet("/sign")
public class SignController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String view = "/WEB-INF/jsp/sign/sign.jsp";
		RequestDispatcher redi = request.getRequestDispatcher(view);
		redi.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String user_id = request.getParameter("userId");
		String password = request.getParameter("userPw");
		String password_ck = request.getParameter("userPwCk");
		String user_name = request.getParameter("userName");
		String user_email = request.getParameter("userEmail");
		String user_phone = request.getParameter("userPhone");
		
		SignDTO dto = new SignDTO(user_id, password, 
				user_name, user_email, user_phone);
		SignService service = new SignService();
		
		if(service.isValid(dto)) {
			// 이상 없는 경우 가입
			if(service.joinAccount(dto)) {
				response.sendRedirect("/login");
				System.out.println("완전성공");
			} else {
				System.out.println("오류");
			}
		} else {
			System.out.println("오류2");
		}

	}

}
