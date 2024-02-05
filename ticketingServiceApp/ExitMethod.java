package com.ABCTravels;

public class ExitMethod {

//	For quitting the ticketing service by printing logo and a thanks message
	void exit() {
		DisplayLogo d1 = new DisplayLogo();
		String filePath = "C:\\Users\\91703\\eclipse-workspace\\ABCTravels\\src\\com\\ABCTravels\\abcTravelsLogo.txt";
		d1.displayLogo(filePath);
		System.out.println("Thanks for using ABC Travels Tiketing Service.");
	}

}
