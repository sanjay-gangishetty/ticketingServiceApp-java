package com.ABCTravels;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateMethods {

//	Gives user an option to select date for journey
	String dateSelect(Scanner sc) {
		int choice;
		String journeyDate = journeyDate(2);
		System.out.println();
		System.out.println("Please choose the action you want to perform from the below menu.");
		System.out.println("1. " + journeyDate(2) + "\n2. " + journeyDate(4) + "\n3. " + journeyDate(6) + "\n4. Quit");
		System.out.println("Enter the number(1 or 2) to perform the action - ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			journeyDate = journeyDate(2);
			break;
		case 2:
			journeyDate = journeyDate(4);
			break;
		case 3:
			journeyDate = journeyDate(6);
			break;
		default:
			System.out.println("Please select the appropriate number");
			dateSelect(sc);
			break;
		}
		return journeyDate;
	}

//	For getting the journey date by taking days as input
	String journeyDate(int days) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return dateFormatter.format(date.plusDays(days));
	}

//	Returns Current Date
	String currentDateFetcher() {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY hh:mm");
		return dateFormatter.format(date);
	}

//	For fetching the date for rescheduling 
	String dateForRescheduling(int days, int ticketid) {
		TicketBooking ticket = TravelDataMethods.TicketFetch(ticketid);
		String dateStr = ticket.Date;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(dateStr, formatter);
		// Adds days from input
		LocalDate newDate = date.plusDays(days);
		String formattedDate = newDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		return formattedDate;
	}

}
