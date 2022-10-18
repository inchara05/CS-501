//user defined package
//package com.packages;

import java.util.Scanner;

/* The class Edition12C3E3_3LE is a 
 * 2*2 linear equation program 
 * solved using Cramer’s rule.
 */
public class Edition12C3E3_3LE 
{
  //main method
  public static void main(String[] args) 
  {
	  //create a scanner object
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("//2*2 linear equation using Cramer’s rule//\n");
	  System.out.print("Enter the number values for a, b, c, d, e, f separated by space without parenthsis : ");
	  double a = input.nextDouble();
	  double b = input.nextDouble();
	  double c = input.nextDouble();
	  double d = input.nextDouble();
	  double e = input.nextDouble();
	  double f = input.nextDouble();
	 
	  if (a * d - b * c == 0) 
	  {
		  System.out.println("The equation has no solution.");
		  System.exit(0);
	  }
	  
	  //Cramer’s rule
	  System.out.println(a +"x + "+ b+"y = "  + e);
	  System.out.println(c +"x + "+ d+"y = "  + f +"\n");
	  double x = (e * d - b * f) / (a * d - b * c);
	  double y = (a * f - e * c) / (a * d - b * c);
	 
	  //Display the result on the console
	  System.out.print("The linear equation of x and y for given values a,b,c,d,e,f is x = "+x+ " and y = " +y);
  }
 
}
