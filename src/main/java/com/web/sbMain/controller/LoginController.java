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
		String userid = request.getParameter("USERID");
		String userpw = request.getParameter("PASSWORD");
		
		SignDTO dto = new SignDTO(userid, userpw);
		SignService service = new SignService();
		
		if(service.login(dto)) {
			HttpSession session = request.getSession();
			session.setAttribute("sign", dto);
			session.setAttribute("logined", true);
			response.sendRedirect(request.getContextPath() + "/");
		} else {
			String view = "/WEB-INF/jsp/login/login.jsp";
			RequestDispatcher redi = request.getRequestDispatcher(view);
			redi.forward(request, response);
		}
	}
}
