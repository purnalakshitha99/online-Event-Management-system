package com.eventOwner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/log")
public class LoginServletEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue = DButilUser.validate(uname, password);
		
		if(isTrue == true) {
			
			
			
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			RequestDispatcher dis = request.getRequestDispatcher("EventOwnerHome.jsp");
			dis.forward(request, response);
		}
		else {
		
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
			System.out.println("waradi");
			out.println("<script type = 'text/javascript'");
			out.println("alert('you username or password incorrect')");
			out.println("location = 'Login.jsp'");
			out.println("</script>");
		}
		
	}

}
