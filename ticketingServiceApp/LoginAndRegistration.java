package com.ABCTravels;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginAndRegistration {

	static ArrayList<UsersData> users = new ArrayList<UsersData>();

//	For new Admin registration 
	static void newAdminUserRegistration(Scanner sc) {
		try {
			System.out.println("*------* New User Registration *------*");
			System.out.println("Enter your First Name");
			sc.nextLine();
			String fname = sc.nextLine();
			System.out.println("Enter your Last Name");
			String lname = sc.nextLine();
			System.out.println("Enter your mobile number");
			long mobileNo = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter your Gender");
			String gender = sc.next();
			sc.nextLine();
			System.out.println("Enter your Email");
			String email = sc.nextLine();
			System.out.println("Enter your Password");
			String password = sc.nextLine();
			int failedCount = 0;
			int accountStatus = 1;
			System.out.println();
			System.out.println("   -------- The Data you entered is --------   ");
			System.out.println();
			System.out.println("First name: " + fname + "\nlast name: " + lname + "\nMobile Number: " + mobileNo);
			System.out.println("Gender: " + gender + "\nEmail: " + email + "\nPassword: " + password);
			UsersData p1 = new UsersData(fname, lname, gender, email, password, failedCount, accountStatus, mobileNo);
			UsersMethods.AddUser(p1);
			System.out.println(
					"Congratulations " + UsersMethods.FoundUser(0).fname + ". You have been registered as new Admin");
			System.out.println();
			UserActions.userAction(sc);
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid value.");
			sc.nextLine();
			newAdminUserRegistration(sc);
		}
	};

//	Existing User Login
	static void existingUserLogin(Scanner sc) {
		try {
			System.out.println();
			System.out.println("   *------* Welcome Back *------*   ");
			System.out.println("Enter your Email");
			sc.nextLine();
			String email = sc.nextLine();
			System.out.println("Enter your Password");
			String password = sc.nextLine();
			System.out.println();
			System.out.println("The Data you entered is");
			System.out.println("Email: " + email + "\nPassword: " + password);
			System.out.println();
			UsersData userData = UsersMethods.UsersEmailList(email);
			if (!(email == "")) {
				if (!(userData == null)) {
					if (email.equalsIgnoreCase(userData.email)) {
						if (password.equals(userData.password)) {
							if (userData.failedCount < 5 && userData.accountStatus == 1) {
								System.out.println("Welcome back " + userData.fname);
								System.out.println();
								JourneyPlanner.planJourney(sc);
							} else {
								System.out.println("Your account has been locked for trying many times.");
								System.out.println("Login with other account or create new one.");
								UserActions.userAction(sc);
							}
						} else {
							if (userData.accountStatus == 1) {
								UsersMethods.FailedCountUpdater(email);
								System.out.println("password is incorrect,retry!!");
								System.out.println("You have " + (5 - userData.failedCount) + " more chances left.");
								if (userData.failedCount == 5) {
									UsersMethods.AccountStatusUpdate(email, 0);
								}
								System.out.println();
								UserActions.userAction(sc);
							} else {
								System.out.println("Your account has been locked for trying many times.");
								System.out.println("Login with other account or create new one.");
								UserActions.userAction(sc);
							}
						}
					}
				} else {
					System.out.println("User not found!!!");
					System.out.println("Create account or try logging in again!!");
					UserActions.userAction(sc);
				}
			} else {
				System.out.println("Please enter email");
				existingUserLogin(sc);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid value.");
			sc.nextLine();
			existingUserLogin(sc);
		}
	};

}
