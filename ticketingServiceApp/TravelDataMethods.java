package com.ABCTravels;

import java.util.ArrayList;
import java.util.List;

public class TravelDataMethods {

	static List<TicketBooking> travelData = new ArrayList<TicketBooking>();
	
	public static List<TicketBooking> GetAllTickets() {
		return travelData;
	}

	public static void AddTicket(TicketBooking ticket) {
		travelData.add(ticket);
	}

	public static TicketBooking TicketFetch(int id) {
		for (TicketBooking ticket : travelData) {
			if (ticket.ticketId == id) {
				return ticket;
			}
		}
		return null;
	}

	public static void TicketTravelDateUpdater(int id, String date) {
		for (TicketBooking ticket : travelData) {
			if (ticket.ticketId == id) {
				ticket.Date = date;
			}
		}
	}

	public static String DateforRescheduling() {
		for (TicketBooking ticket : travelData) {

			return ticket.Date;
		}
		return "";
	}

}
