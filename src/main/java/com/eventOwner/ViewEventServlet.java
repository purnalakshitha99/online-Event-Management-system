package com.eventOwner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/view")
public class ViewEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
			
		
			List<EventDetailsClass> events = DButilUser.getEvent();
			request.setAttribute("events", events);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			dis.forward(request, response);
	
		}catch(Exception e) {
		e.printStackTrace();
	}

}
}
