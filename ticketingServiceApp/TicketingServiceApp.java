package com.ABCTravels;

import java.util.Scanner;



public class TicketingServiceApp {

	static DisplayLogo dl = new DisplayLogo();
	static ExitMethod e1 = new ExitMethod();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String filePath = "C:\\Users\\91703\\eclipse-workspace\\ABCTravels\\src\\com\\ABCTravels\\abcTravelsLogo.txt";
		try {
			dl.displayLogo(filePath);
			UserActions.userAction(sc);
		} catch (Exception e) {
			System.out.println("Error occured in the main method");
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
