package com.ABCTravels;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayLogo {

//	Displays the Logo
	void displayLogo(String InputfilePath) {
		BufferedReader reader;
		try {
			String filePath = InputfilePath;
			reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
