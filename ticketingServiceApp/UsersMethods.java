package com.ABCTravels;

import java.util.ArrayList;

public class UsersMethods {

	static ArrayList<UsersData> users = new ArrayList<UsersData>();

	public static ArrayList<UsersData> AllUsersList() {
		return users;
	}

	public static void AddUser(UsersData user) {
		users.add(user);
	}

	public static UsersData FoundUser(int user) {
		users.get(user);
		return users.get(user);
	}

	public static UsersData UsersList(String email, String password) {
		for (UsersData user : users) {
			if (email.equalsIgnoreCase(user.email) && password.equalsIgnoreCase(user.password)) {
				return user;
			}
		}
		return null;
	}

	public static UsersData UsersEmailList(String email) {
		for (UsersData user : users) {
			if (email.equalsIgnoreCase(email)) {
				return user;
			}
		}
		return null;
	}

	public static void FailedCountUpdater(String email) {
		for (UsersData user : users) {
			if (email.equalsIgnoreCase(user.email)) {
				user.failedCount++;
			}
		}
	}

	public static void AccountStatusUpdate(String email, int status) {
		for (UsersData user : users) {
			if (email.equalsIgnoreCase(user.email)) {
				user.accountStatus = status;
			}
		}
	}

}
