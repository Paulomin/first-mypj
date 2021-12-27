package com.web.sbMain.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.web.sbMain.model.*;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String view = "/WEB-INF/jsp/login/login.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String userid = request.getParameter("user-id");
		String userpw = request.getParameter("user-pw");
		
		SignDTO dto = new SignDTO(userid, userpw);
		SignService service = new SignService();
		
		if(service.login(dto)) {
			HttpSession session = request.getSession();
			session.setAttribute("sign", dto);
			session.setAttribute("logined", true);
			response.sendRedirect(request.getContextPath() + "/");
			System.out.println("good");
		} else {
			String view = "/WEB-INF/jsp/login/login.jsp";
			RequestDispatcher redi = request.getRequestDispatcher(view);
			request.setAttribute("fail", "ID 혹은 비밀번호를 잘못 입력하셨거나 등록되지 않은 ID 입니다.");
			redi.forward(request, response);
			
		}
	}
}
