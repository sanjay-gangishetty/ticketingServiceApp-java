package com.ABCTravels;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JourneyPlanner {

	static DateMethods dm = new DateMethods();
	static ExitMethod e = new ExitMethod();
	static int bus1Seats = 30, bus2Seats = 30, bus3Seats = 30;

	// For planning Journey by selecting route and seats
	public static String planJourney(Scanner sc, UsersData user) {
		try {
			System.out.println("------ Please select route station ------");
			System.out.println();
			System.out.println(
					"1. Hyderabad to Vijayawada\n2. Hyderabad to Bengaluru\n3. Hyderabad to Vishakapatnam\n4. Quit ");
			System.out.println("Enter the number(1 or 2) to select Source");
			System.out.println();
			int UserInput = sc.nextInt();
			String source = "", journeyDate;
			int price;
			switch (UserInput) {
			case 1:
				source = "Hyderabad to Vijayawada";
				price = 1100;
				journeyDate = dm.dateSelect(sc);
				FareCalculator.fareCalculator(sc, source, price, bus1Seats, journeyDate, user);
				break;
			case 2:
				source = "Hyderabad to Bengaluru";
				price = 1700;
				journeyDate = dm.dateSelect(sc);
				FareCalculator.fareCalculator(sc, source, price, bus2Seats, journeyDate, user);
				break;
			case 3:
				source = "Hyderabad to Vishakapatnam";
				price = 1300;
				journeyDate = dm.dateSelect(sc);
				FareCalculator.fareCalculator(sc, source, price, bus3Seats, journeyDate, user);
				break;
			case 4:
				e.exit();
				break;
			default:
				planJourney(sc, user);
				break;
			}
			return source;
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			sc.nextLine();
			return planJourney(sc, user);
		}
	}

}
