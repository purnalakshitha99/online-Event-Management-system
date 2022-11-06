package com.eventOwner;

public class EventDetailsClass {
	
	
		private int eventId;
		private String eventName;
		private String date;
		private String Venue;
		private int numberOfGuest;
		private String Handleby;
		
	
		public EventDetailsClass(int eventId,String date,String venue,int numberOfGuest,String Handleby) {
			this.eventId = eventId;
			this.date = date;
			this.Venue = venue;
			this.numberOfGuest = numberOfGuest;
			this.Handleby = Handleby;
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
			return Venue;
		}


		


		public int getNumberOfGuest() {
			return numberOfGuest;
		}


		


		public String getHandleby() {
			return Handleby;
		}


		
		
	}


