package com.ABCTravels;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BillPrinter {

	static DateMethods dm = new DateMethods();
	static int id = 0;

//	Prints bill and calls userAction2 method 
	static void billPrinter(Scanner sc, String source, int passengers, int price, String journeyDate, UsersData user) {
		try {
			LocalDate formattedJourneyDate = LocalDate.parse(journeyDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			DayOfWeek day = formattedJourneyDate.getDayOfWeek();
			String currentDate = dm.currentDateFetcher();
			int exclusiveGSTFare, inclusiveGSTFare;
			if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
				exclusiveGSTFare = (price + 200) * passengers;
			} else {
				exclusiveGSTFare = price * passengers;
			}
			inclusiveGSTFare = exclusiveGSTFare + (((price * passengers) * 5) / 100);
			id++;
			TicketBooking t1 = new TicketBooking(source, journeyDate, day, passengers, inclusiveGSTFare, currentDate,
					id, user.email);
//			Adds Ticket
			TravelDataMethods.AddTicket(t1);
			System.out.println("--------------ABC Travels--------------");
			System.out.println();
			System.out.println("Your Trip Details - ");
			System.out.println();
			System.out.println("Ticket ID                 :  " + id);
			System.out.println("Source and Destination    :  " + source);
			System.out.println("Journey Date              :  " + journeyDate);
			System.out.println("Journey Day               :  " + day);
			System.out.println("Time                      :  20:00 P.M - 06:00 A.M");
			System.out.println("Number of Passengers      :  " + passengers);
			if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
				System.out.println(
						"Fare                      :  " + (price + 200) + "*" + passengers + "=" + exclusiveGSTFare);
			} else {
				System.out.println("Fare                      :  " + price + "*" + passengers + "=" + exclusiveGSTFare);
			}
			System.out.println("GST                       :  5%");
			System.out.println("Total Fare(Inclusive GST) :  " + inclusiveGSTFare);
			System.out.println();
			System.out.println("Booking Date              :  " + currentDate);
			System.out.println();
			System.out.println("Thanks for Choosing ABC Travels");
			System.out.println("Terms and Conditions : ");
			System.out.println("1. Once booked cannot cancel the ticket.");
			System.out.println("2. Can Reshedule tickets.");
			System.out.println("---------------------------------------");
			System.out.println();
			UserActions.userAction2(sc);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid value.");
			sc.nextLine();
			billPrinter(sc, source, passengers, price, journeyDate, user);
		}
	}

}
