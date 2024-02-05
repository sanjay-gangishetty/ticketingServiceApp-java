package com.ABCTravels;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserActions {

	static ExitMethod e = new ExitMethod();

//	Takes user Input for new Admin registration or existing user Login
	static void userAction(Scanner sc) {
		try {
			System.out.println("Please choose the action you want to perform from the below menu.");
			System.out.println("1. New Admin User Registration\n2. Existing User Login\n3. Quit\n4. Display All Users");
			System.out.println("Enter the number(1 or 2) to perform the action");
			int UserInput = sc.nextInt();
			switch (UserInput) {
			case 1:
				LoginAndRegistration.newAdminUserRegistration(sc);
				break;
			case 2:
				LoginAndRegistration.existingUserLogin(sc);
				break;
			case 3:
				e.exit();
				break;
			case 4:
				DisplayAllUsers.displayAllUsers(sc);
			default:
				userAction(sc);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid number.");
			sc.nextLine();
			userAction(sc);
		}
	}

//	For rescheduling journey or going to home page or to quit
	static void userAction2(Scanner sc) {
		try {
			int choice;
			System.out.println();
			System.out.println("Please choose the action you want to perform from the below menu.");
			System.out.println("1. Reschedule Journey\n2. Go to Home page\n3. Fetch all Bookings\n4. Quit");
			System.out.println("Enter the number(1 or 2) to perform the action - ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				userAction3(sc);
				break;
			case 2:
				userAction(sc);
				break;
			case 3:
				FetchBookings.fetchBookings(sc);
				break;
			case 4:
				e.exit();
				break;
			default:
				userAction2(sc);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid value.");
			sc.nextLine();
			userAction(sc);
		}
	}

//	For re-planning the journey or to quit
	static void userAction3(Scanner sc) {
		try {
			int choice;
			System.out.println();
			System.out.println("------ Reschedule Journey ------");
			System.out.println("Please choose the action you want to perform from the below menu.");
			System.out.println("1. Reschedule the total Journey\n2. Quit");
			System.out.println("Enter the number(1 or 2) to perform the action - ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				RescheduleJourney.rescheduleJourney(sc);
				break;
			case 2:
				e.exit();
				break;
			default:
				userAction3(sc);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid value.");
			sc.nextLine();
			userAction3(sc);
		}
	}

}
