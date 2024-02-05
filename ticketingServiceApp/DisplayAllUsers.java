package com.ABCTravels;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayAllUsers {

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
		UserActions.userAction(sc);
	}

}
