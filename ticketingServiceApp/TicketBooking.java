package com.ABCTravels;

import java.time.DayOfWeek;

public class TicketBooking {

	String sourceAndDest;
	String bookingDate;
	DayOfWeek Day;
	String Date;
	int Passengers, fare, ticketId;
	String username;

//	Constructor
	TicketBooking(String sourceAndDest, String Date, DayOfWeek Day, int Passengers, int fare, String bookingDate,
			int ticketId, String username) {
		this.sourceAndDest = sourceAndDest;
		this.Date = Date;
		this.Day = Day;
		this.Passengers = Passengers;
		this.fare = fare;
		this.bookingDate = bookingDate;
		this.ticketId = ticketId;
		this.username = username;
	}

}
