//user defined package
//package com.packages;

import java.util.Scanner;

/* The class Edition12C3E3_27PIT will 
 * find out whether the point is in 
 * triangle or not.
*/
public class Edition12C3E3_27PIT 
{
	//main method
	public static void main(String[] args) 
	{
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("//Finding out whether the point is in triangle or not//\n");
	    System.out.print("Enter a number values for points x and y coordinates separated by space without parenthesis:");
	    double x = input.nextDouble();
	    double y = input.nextDouble();
 
        // Find if x and y point is in the triangle or not and display the result on the console
        if(( (y > 0) && (x > 0) && (x + 2*y < 200) ))
        {
        	System.out.print("The point is in the triangle");
        }
        else
        {
        	System.out.print("The point is not in the triangle");
        }
    }
}
