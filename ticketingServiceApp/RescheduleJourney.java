package com.ABCTravels;

import java.util.Scanner;

public class RescheduleJourney {

	static DateMethods dm = new DateMethods();
	static ExitMethod e = new ExitMethod();

	public static int TicketIdInput(Scanner sc) {
		try {
			System.out.println("Please enter the Ticket id : ");
			System.out.println();
			int ticketId = sc.nextInt();
			return ticketId;
		} catch (Exception e) {
			System.out.println("An error occured in TicketIdInput method.");
			TicketIdInput(sc);
		}
		return 0;
	}

//	For updating the journey date by taking the date wanted
	public static void rescheduleJourney(Scanner sc) {
		int ticketID = TicketIdInput(sc);
		TicketBooking ticketData = TravelDataMethods.TicketFetch(ticketID);
		int choice;
		System.out.println();
		System.out.println("------ Reschedule Journey ------");
		System.out.println("Please choose the action you want to perform from the below menu.");
		System.out.println("We have busses every 2 days, please check and choose from below.");
		System.out.println("1. " + dm.dateForRescheduling(2, ticketData.ticketId) + "\n2. "
				+ dm.dateForRescheduling(4, ticketData.ticketId) + "\n3. "
				+ dm.dateForRescheduling(6, ticketData.ticketId) + "\n4. Quit");
		System.out.println("Enter the number(1 or 2) to perform the action - ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			TravelDataMethods.TicketTravelDateUpdater(ticketData.ticketId,
					dm.dateForRescheduling(2, ticketData.ticketId));
			break;
		case 2:
			TravelDataMethods.TicketTravelDateUpdater(ticketData.ticketId,
					dm.dateForRescheduling(4, ticketData.ticketId));
			break;
		case 3:
			TravelDataMethods.TicketTravelDateUpdater(ticketData.ticketId,
					dm.dateForRescheduling(6, ticketData.ticketId));
			break;
		case 4:
			e.exit();
			break;
		default:
			rescheduleJourney(sc);
			break;
		}
		System.out.println("Your new booking data is : ");
		FetchBookings.fetchBookings(sc);
	}

}
