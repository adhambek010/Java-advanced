package com.advanced.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SiteController() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "login": {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
		}
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userName.equalsIgnoreCase("Adkham") && password.equals("12345")) {
			request.getSession().invalidate();
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
			
			newSession.setAttribute("userName", userName);
			
			response.sendRedirect("member.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

}
