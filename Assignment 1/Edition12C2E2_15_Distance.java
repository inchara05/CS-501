//user defined package
//package com.packages;

/* Scanner is in the java.util package to perform 
 * console input which creates an object to read input from System.in
 */
import java.util.Scanner;

/* The class Edition12C2E2_15_Distance is created to compute
 * the distance of two points(x1,y1) and (x2,y2)
 * and display the results on the console.
 */
public class Edition12C2E2_15_Distance 
{
	//main method
	public static void main(String[] args)	
	{
		//Declare x1,x2,y1,y2 to be a double variables
		double x1,x2,y1,y2;
			
		//create a scanner object
	    Scanner dis =new Scanner(System.in); 
		    
	    System.out.println("Computing the distance of two points(x1,y1) and (x2,y2):\n");
		    
	    //Prompt the user to enter the coordinates x1,x2,y1,y2
	    System.out.println("Enter the coordinate for x1 and press enter (Note: Coordinate should be a number)");	 
		    
	    //read a double
	    x1=dis.nextDouble(); 
	        
	        
	    System.out.println("Enter the coordinate for y1 and press enter (Note: Coordinate should be a number)");	   
	    y1=dis.nextDouble();
	        
	    System.out.println("Enter the coordinate for x2 and press enter (Note: Coordinate should be a number)");	   
	    x2=dis.nextDouble();
	        
	    System.out.println("Enter the coordinate for y2 and press enter (Note: Coordinate should be a number)");	   
	    y2=dis.nextDouble();	  	    
	        
	    /*Declare total to be a double variable 
	     * and Compute Distance(total) using formula.
	     */
		double total=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 	 
			
		//Display the result on the console
	 	System.out.println("The distance between the two points"+" (x1 = "+x1+", y1 = "+y1+") and "+"(x2 = "+x2+", y2 = "+y2+") is "+total); 
	} 

}
