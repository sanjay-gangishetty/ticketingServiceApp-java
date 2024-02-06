package com.ABCTravels;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FareCalculator {

//	calculates fare by seats and passengers and calls bill printer method
	static void fareCalculator(Scanner sc, String source, int price, int seats, String journeyDate, UsersData user) {
		try {
			System.out.println(seats + " Seats are Empty");
			System.out.println("Enter number of passengers");
			int passengers = sc.nextInt();
			System.out.println();
			seats = seats - passengers;
			if (seats > 0) {
				BillPrinter.billPrinter(sc, source, passengers, price, journeyDate, user);
			} else {
				System.out.println("Only " + seats + " Seats are Empty");
				System.out.println("Please reduce passengers and retry!!");
				fareCalculator(sc, source, price, seats, journeyDate, user);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			sc.nextLine();
			fareCalculator(sc, source, price, seats, journeyDate, user);
		}
	}

}
