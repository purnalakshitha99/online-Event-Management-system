package com.eventOwner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@webServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		String role = request.getParameter("role");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String fullName = request.getParameter("fullname");
		
	  boolean isTrue = false;
	  
	  isTrue = DButilUser.RegistrationUser(username, password, role, address, city, fullName);
	  
	  if(isTrue == true) {
		  
		  RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		  dis.forward(request, response);
	  }else {
		  RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
		  dis.forward(request, response);
	  }
		
		
		

}
}
