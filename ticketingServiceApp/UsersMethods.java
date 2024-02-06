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

//	If user SuperAdmin == 1, user is superAdmin and has crud operation permission
	public static void BecomeSuperAdmin(String email, int key) {
		for (UsersData user : users) {
			if (email.equalsIgnoreCase(user.email)) {
				System.out.println("Email Found");
				if (key == 123) {
					user.SuperAdmin = 1;
					System.out.println(user.fname + " is Super Admin now.");
				}
			}
		}
	}

	public static boolean SuperAdminFetch(String email) {
		for (UsersData user : users) {
			if (email.equalsIgnoreCase(user.email)) {
				if (user.SuperAdmin == 1) {
					return true;
				}
			}
		}
		return false;
	}

}
