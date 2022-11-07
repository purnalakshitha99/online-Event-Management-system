package com.eventOwner;

public class EventDetailsClass {
	
	

	private int eventId;
	private String eventName;
	private String date;
	private String venue;
	private int numberOfGuest;
	private String handler;
		
		
	
		public EventDetailsClass(int eventId,String name,String date,String Venue,int numberOfGuest,String handler) {
			System.out.println(Venue);
			this.eventId = eventId;
			this.eventName = name;
			this.date = date;
			this.venue = Venue;
			this.numberOfGuest = numberOfGuest;
			this.handler =handler;
		}

		public int getEventId() {
			return eventId;
		}



		public String getEventName() {
			return eventName;
		}



		public String getDate() {
			return date;
		}



		public String getVenue() {
			return venue;
		}



		public int getNumberOfGuest() {
			return numberOfGuest;
		}


		public String getHandler() {
			return handler;
		}



		
	}


