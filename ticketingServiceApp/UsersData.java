package com.ABCTravels;

public class UsersData {

	String fname, lname, gender, email, password;
	int failedCount, accountStatus, SuperAdmin;
	long mobileNo;

//	Constructor
	UsersData(String fname, String lname, String gender, String email, String password, int failedCount,
			int accountStatus, long mobileNo) {
		try {
			if (fname == null || lname == null || gender == null || email == null || password == null) {
				throw new IllegalArgumentException("Invalid input: Name, gender, email, and password cannot be null.");
			}
			if (mobileNo < 0) {
				throw new IllegalArgumentException("Invalid input: Mobile number cannot be negative.");
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.failedCount = failedCount;
		this.accountStatus = accountStatus;
		this.mobileNo = mobileNo;
		this.SuperAdmin = 0;
	}

}
