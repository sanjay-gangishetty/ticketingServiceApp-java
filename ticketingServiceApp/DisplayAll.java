package com.ABCTravels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayAll {

	static void displayAllUsers(Scanner sc) {
		ArrayList<UsersData> u = UsersMethods.AllUsersList();
		System.out.println("*****--------------------------------------*****");
		System.out.println(" Fname " + " Gender " + "    Email " + " Password ");
		System.out.println();
		for (UsersData user : u) {
			System.out.println(user.fname + "   " + user.gender + "    " + user.email + " " + user.password + " ");
		}
		System.out.println();
		System.out.println("*****--------------------------------------*****");
		UserActions.SuperAdminRoutes(sc);
	}

	static void displayAllTickets(Scanner sc) {
		List<TicketBooking> tickets = TravelDataMethods.GetAllTickets();
		System.out.println("*****--------------------------------------*****");
		System.out.println(" Booked By " + "Ticket Id" + "Sce And Dest " + "Fare");
		System.out.println();
		for (TicketBooking ticket : tickets) {
			System.out
					.println(ticket.username + " " + ticket.ticketId + " " + ticket.sourceAndDest + " " + ticket.fare);
		}
		System.out.println();
		System.out.println("*****--------------------------------------*****");
		UserActions.SuperAdminRoutes(sc);
	}

}
