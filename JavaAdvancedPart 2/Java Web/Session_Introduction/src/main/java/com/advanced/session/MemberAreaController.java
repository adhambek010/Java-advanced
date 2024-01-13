package com.advanced.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberAreaController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		switch (action) {
		case "destroy": {
			request.getSession().invalidate();
			response.sendRedirect("login.jsp");
		}

		}

	}

}
