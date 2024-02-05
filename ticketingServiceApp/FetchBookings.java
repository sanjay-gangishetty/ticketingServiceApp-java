package com.ABCTravels;

import java.util.Scanner;

public class FetchBookings {

//	For fetching all the bookings
	public static void fetchBookings(Scanner sc) {
		System.out.println(
				"*****------------------------------------------------------------------------------------*****");
		System.out.print("Ticket ID    " + "Source And Destination     " + "  Booking Date   "
				+ "      Travel Date     " + "     Passengers   " + "   Fare");
		System.out.println();
		for (TicketBooking ticket : TravelDataMethods.travelData) {
			System.out.println();
			System.out.print(
					ticket.ticketId + "         " + ticket.sourceAndDest + "     " + ticket.bookingDate + "      "
							+ ticket.Date + "               " + ticket.Passengers + "          " + ticket.fare + ".00");
			System.out.println();
		}
		System.out.println(
				"*****------------------------------------------------------------------------------------*****");
		System.out.println();
		System.out.println("Your are being redirected to reschedule menu ......");
		UserActions.userAction2(sc);
	}

}
