package com.eventOwner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addEventServlet")
public class addEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String eventname = request.getParameter("eventName");
		String date = request.getParameter("date");
		String venue = request.getParameter("venue");
		int numberOfGuest = Integer.parseInt(request.getParameter("numberOfGuest"));
		String handler = request.getParameter("handler");
		boolean isTrue = false;
		
		isTrue = DButilUser.insertEvent(eventname, date, venue, numberOfGuest, handler);
		
		if(isTrue == true) {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Event Inset Success!');");
			out.println("location = 'EventOwnerHome.jsp'");
			out.println("</script>");
		}else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Inser Unsuccess');");
			out.println("location = 'EventOwnerHome.jsp'");
			out.println("</script>");
		}
		
		
		
	}

}
