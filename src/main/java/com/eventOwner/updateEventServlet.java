package com.eventOwner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/update")
public class updateEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("eventid");
		String name = request.getParameter("eventname");
		String date = request.getParameter("eventdate");
		String venue = request.getParameter("eventvenue");
		String  guest = request.getParameter("numberofguest");
		String handler = request.getParameter("eventhandler");
		
		
		boolean isTrue = false;
		 isTrue = DButilUser.updateEvent(id, name, date, venue, guest, handler);
		 
		 if(isTrue == true) {
			 
			 System.out.println("update wenwa");
			 List<EventDetailsClass> events = DButilUser.getEvent();
			 request.setAttribute("events", events);
			 
			 RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			 dis.forward(request, response);
			 
			 
			 }
		 else {
			 List<EventDetailsClass> events = DButilUser.getEvent();
			 request.setAttribute("events", events);
			 
			 RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			 dis.forward(request, response);
		 }
	}

}
