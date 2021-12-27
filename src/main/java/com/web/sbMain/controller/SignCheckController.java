package com.web.sbMain.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.json.simple.*;
import com.web.sbMain.model.*;

@WebServlet("/sign/check")
public class SignCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String user_id = request.getParameter("userId");
		
		SignService service = new SignService();
		SignDTO dto = new SignDTO(user_id);
		SignDTO data = service.findAccount(dto);
		
		JSONObject json = new JSONObject();
		if(data == null) {
			json.put("state", "possible");
		} else {
			json.put("state", "used");
		}
		
		response.getWriter().println(json.toJSONString());
		response.getWriter().flush();
	}

}
