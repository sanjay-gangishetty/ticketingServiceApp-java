package com.ABCTravels;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JourneyPlanner {

	static DateMethods dm = new DateMethods();
	static ExitMethod e = new ExitMethod();

	// For planning Journey by selecting route and seats
	public static String planJourney(Scanner sc) {
		try {
			System.out.println("------ Please select route station ------");
			System.out.println();
			System.out.println(
					"1. Hyderabad to Vijayawada\n2. Hyderabad to Bengaluru\n3. Hyderabad to Vishakapatnam\n4. Quit ");
			System.out.println("Enter the number(1 or 2) to select Source");
			System.out.println();
			int UserInput = sc.nextInt();
			String source = "", journeyDate;
			int price, seats;
			switch (UserInput) {
			case 1:
				source = "Hyderabad to Vijayawada";
				price = 1100;
				seats = 30;
				journeyDate = dm.dateSelect(sc);
				FareCalculator.fareCalculator(sc, source, price, seats, journeyDate);
				break;
			case 2:
				source = "Hyderabad to Bengaluru";
				price = 1700;
				seats = 30;
				journeyDate = dm.dateSelect(sc);
				FareCalculator.fareCalculator(sc, source, price, seats, journeyDate);
				break;
			case 3:
				source = "Hyderabad to Vishakapatnam";
				price = 1300;
				seats = 30;
				journeyDate = dm.dateSelect(sc);
				FareCalculator.fareCalculator(sc, source, price, seats, journeyDate);
				break;
			case 4:
				e.exit();
				break;
			default:
				planJourney(sc);
				break;
			}
			return source;
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			sc.nextLine();
			return planJourney(sc);
		}
	}

}
