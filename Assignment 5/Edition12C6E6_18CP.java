//self-defined package
//package com;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*This Program will check for the password*/
public class Edition12C6E6_18CP {
	// main method
	public static void main(String[] args) {
		int cycle2 = 1;
		// create a scanner
		Scanner input = new Scanner(System.in);
		System.out.println(
				"*This Program will check for the password*" + "\n\nPress 1 if you wish to continue or 0 to exit:");
		cycle2 = input.nextInt();
		if (cycle2 == 1) {
			int option = JOptionPane.YES_OPTION;
			while (option == JOptionPane.YES_OPTION) {
				try {
					String password = JOptionPane
							.showInputDialog("Enter a password that must be:\n" + "1) Atleast 8 characters long\n"
									+ "2) Letters and atleast 2 numerical digits are allowed\n"
									+ "3) No special symbols are allowed");

					if (chkPswd(password)) { // checking for a valid password
						option = JOptionPane.showConfirmDialog(null, "Valid Password" + "\nDo you want to continue?");
					} else {
						String outputStr = ("Invalid Password \nDo you want to continue?");
						option = JOptionPane.showConfirmDialog(null, outputStr);
					}
				} catch (Exception ex) {
					String outputStr1 = ("Invalid Password \nDo you want to continue?");
					option = JOptionPane.showConfirmDialog(null, outputStr1);

				}
			}
		}
	}

	public static boolean chkPswd(String password) {
		boolean chkPswd = true;

		if (password.length() < 8) {
			chkPswd = false;
		} else {
			int numberOfDigit = 0;
			for (int i = 0; i < password.length(); i++) {
				if (isDigit(password.charAt(i)) || isLetter(password.charAt(i))) {
					if (isDigit(password.charAt(i))) {
						numberOfDigit++;
					}

				} else {
					chkPswd = false;
					break;
				}
			}

			if (numberOfDigit < 2) {
				chkPswd = false;
			}
		}

		return chkPswd;

	}

	public static boolean isLetter(char ch) { //to check the password is letter

		return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));

	}

	public static boolean isDigit(char ch) { to check the password is digit
		return (ch <= '9' && ch >= '0');
	}

}
