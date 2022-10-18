//self-defined package
//package com;

import java.util.GregorianCalendar;

/* The class Edition12C9E9_5Cal can be used to obtain the 
 * current year, month, and day of a date and to set a specified elapsed 
 * time since January 1, 1970.
 */
public class Edition12C9E9_5Cal {

	// Main method
	public static void main(String[] args) {

		// Creating an object
		GregorianCalendar cal = new GregorianCalendar();
		int x= cal.get(GregorianCalendar.MONTH)+1;
		// Displaying the current year,month and day
		System.out.println("//GregorianCalendar//\n");
		System.out.println("The current year, month, and day: ");
		System.out.println("Current Day of the month: " + cal.get(cal.DAY_OF_MONTH));
		System.out.println("Current Month of the year: " + x);
		System.out.println("Current Year: " +cal.get(cal.YEAR));

		// Setting the specified time since January 1, 1970 to 1234567898765L
		cal.setTimeInMillis(1234567898765L);
		x= cal.get(GregorianCalendar.MONTH)+1;
		// Displaying the year, month and day
		System.out.println("\nThe specified elapsed time since January 1, 1970 set to "
				+ "1234567898765L: ");
		System.out.println("Day of the month: " + cal.get(cal.DAY_OF_MONTH));
		System.out.println("Month of the year: " + x);
		System.out.println("Year: " +cal.get(cal.YEAR));
	}
}
