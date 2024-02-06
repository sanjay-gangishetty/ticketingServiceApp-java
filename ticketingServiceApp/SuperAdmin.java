package com.ABCTravels;

import java.util.Scanner;

public class SuperAdmin {

	static String emailInput(Scanner sc) {
		System.out.println("Please enter your Email");
		String email = sc.nextLine();
		return email;
	}

	static void BecomeSuperAdmin(Scanner sc) {
		System.out.println("Please enter Key");// Key is 123
		int key = sc.nextInt();

		// Consume the newline character after reading the key
		sc.nextLine();

		for (UsersData user : UsersMethods.users) {
			if (emailInput(sc).equalsIgnoreCase(user.email)) {
				System.out.println("Email Found");
				if (!(user.SuperAdmin == 1)) {
					if (key == 123) {
						user.SuperAdmin = 1;
						System.out.println(user.fname + " is Super Admin now.");
					}
				} else {
					System.out.println("You are Already a super Admin!!");
					System.out.println();
					System.out.println("Redirecting to main menu ......");
					System.out.println();
				}
			}
		}

		UserActions.userAction(sc);
	}

}
