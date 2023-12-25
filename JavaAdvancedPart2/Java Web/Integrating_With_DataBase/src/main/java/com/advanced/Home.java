package com.advanced;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.advanced.entity.User;
import com.advanced.model.UsersModel;

@WebServlet("/Home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String page = request.getParameter("page").toLowerCase().trim();

        try {
        	switch (page) {
            case "home":
            	request.setAttribute("title", "Homepage");
                request.getRequestDispatcher("pages/homepage.jsp").forward(request, response);
                break;
            case "list":
            	List<User> users = new ArrayList<User>();
            	users = new UsersModel().listUser();
            	request.setAttribute("users", users);
            	request.setAttribute("title", "users");
                request.getRequestDispatcher("pages/users.jsp").forward(request, response);
                break;
            default:
            	request.setAttribute("title", "Default Page");
                request.getRequestDispatcher("pages/default.jsp").forward(request, response);
                break;
        }
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("title", "Error Page");
			request.getRequestDispatcher("pages/error.jsp").forward(request, response);
		}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String userName = request.getParameter("userName");

        
        @SuppressWarnings("unchecked")
		List<String> userList = (List<String>) getServletContext().getAttribute("userList");

        if (userList == null) {
            userList = new ArrayList<>();
            getServletContext().setAttribute("userList", userList);
        }

        if (userName != null && !userName.trim().isEmpty()) {
            userList.add(userName);
        }

        response.sendRedirect(request.getContextPath() + "/Home?page=users");
    }
}
