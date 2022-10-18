//user defined package
//package com.packages;

/*The class Edition12C4E4_3AFC is
 *calculating the area formed by four cities
 */
public class Edition12C4E4_3AFC

{
	//main method
	public static void main(String[] args) 

	{

	  double x1 = Math.toRadians(33.74899554);
	  double y1 = Math.toRadians(-84.3879824);

	  double x2 = Math.toRadians(28.5383355);
	  double y2 = Math.toRadians(-81.3792365);
	 
	  double x3 = Math.toRadians(32.0835407);
	  double y3 = Math.toRadians(-81.0998342);
	 
	  double x4 = Math.toRadians(35.2270869);
	  double y4 = Math.toRadians(-80.8431267);
 
	  System.out.println("//Finding the total area formed by Atlanta, Orlando, Savannah and Charlotte//\n");
	  System.out.println("Co-ordinates for Atlanta:");
	  System.out.println("latitude: 33.74899554");
	  System.out.println("longitude: -84.3879824\n");
	  System.out.println("Co-ordinates for Orlando:");
	  System.out.println("latitude: 28.5383355");
	  System.out.println("longitude: -81.3792365\n");
	  System.out.println("Co-ordinates for Savannah:");
	  System.out.println("latitude: 32.0835407");
	  System.out.println("longitude: -81.0998342\n");
	  System.out.println("Co-ordinates for Charlotte:");
	  System.out.println("latitude: 35.2270869");
	  System.out.println("longitude: -80.8431267\n");	
	  
	  // Calculating 1st triangle; p1, p2 and, p3
	  double side1 = 6371.01 * (Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))); 
	  double side2 = 6371.01 * (Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3)));
	  double side3 = 6371.01 * (Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3)));
	  
	  System.out.println("//The distance between all these cities//");
	  System.out.println("The distance between Atlanta and Orlando is " +side1+ " kms");
	  System.out.println("The distance between Orlando and Savannah is " +side2+ " kms");
	  System.out.println("The distance between Atlanta and Savannah is " +side3+ " kms");
  
	  double s = (side1 + side2 + side3) / 2;

	  double area1 = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); 

	  // Calculating 2nd triangle; p1, p3 and, p4
	  side1 = 6371.01 * (Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3)));
	  side2 = 6371.01 * (Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4)));
	  side3 = 6371.01 * (Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4)));
	  
	  System.out.println("The distance between Savannah and Charlotte is " +side2+ " kms");
	  System.out.println("The distance between Atlanta and Charlotte is " +side3+ " kms\n");
	  
	  s = (side1 + side2 + side3) / 2;

	  double area2 = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	  
	  System.out.println("The area of triangle formed by 1st triangle: Atlanta, Orlando and Savannah is " +area1+ " km²");
	  System.out.println("The area of triangle formed by 2nd triangle: Atlanta, Charlotte and Savannah is " +area2 + " km²\n");

	 double area = area1 + area2;
	 
	 System.out.println("The sum of 1st and 2nd triangle will form the total area of these four cities");
	 System.out.print("The area formed by Atlanta, Orlando, Savannah and Charlotte is " + area + "km²");
	}
}
