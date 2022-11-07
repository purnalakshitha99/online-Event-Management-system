package com.eventOwner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/delete")
public class DeleteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("eventid").trim();
		
		boolean isTrue = false;
		
		
		isTrue = DButilUser.deleteEvent(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("addEvent.jsp");
			dispatcher.forward(request, response);
		}else {
			List<EventDetailsClass> events = DButilUser.getEvent();
			 request.setAttribute("events", events);
			
			 RequestDispatcher dispatcher = request.getRequestDispatcher("viewEvent.jsp");
				dispatcher.forward(request, response);
			 
		}
	}

}
