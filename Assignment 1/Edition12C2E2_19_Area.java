//user defined package
//package com.packages;

/* Scanner is in the java.util package to perform 
 * console input which creates an object to read input from System.in
 */
import java.util.Scanner;

/* The class Edition12C2E2_19_Area is created to compute
 * the area of a triangle
 * and display the results on the console.
 */
public class Edition12C2E2_19_Area 
{
	//main method
	public static void main(String[] args) 
	{
		//Declare x1,x2,x3,y1,y2,y3 to be a double variables
		double x1, y1, x2, y2, x3, y3;
			
		//create a scanner object
		Scanner tri= new Scanner(System.in);
		
		System.out.println("Enter three points (x1,y1), (x2,y2)and (x3,y3) for computing the Area of a Triangle:\n");
			
		//Prompt the user to enter 3 points
		System.out.println("Enter coordinate for x1 point and press enter (Note: Coordinate should be a number)\"");
			
		//read a double
		x1 = tri.nextDouble(); 
			
		System.out.println("Enter the coordinate for y1 and press enter (Note: Coordinate should be a number)\"");
		y1 = tri.nextDouble();
			
		System.out.println("Enter the coordinate for x2 and press enter (Note: Coordinate should be a number)\"");
		x2 = tri.nextDouble();
			
		System.out.println("Enter the coordinate for y2 and press enter (Note: Coordinate should be a number)\"");
		y2 = tri.nextDouble();
			
		System.out.println("Enter the coordinate for x3 and press enter (Note: Coordinate should be a number)\"");
		x3 = tri.nextDouble();
			
		System.out.println("Enter the coordinate for y3 and press enter (Note: Coordinate should be a number)\"");
		y3 = tri.nextDouble();
			
		/*Declare side1,side2,side3,s,area to be a double variable 
	     * and Compute the Area of Triangle using formula.
         */
		double side1,side2,side3,s,area;
		side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
			
		//Display the result on the console
		System.out.println("The area of the triangle of (x1,y1),(x2,y2)and(x3,y3) is " + area);
	}
}
