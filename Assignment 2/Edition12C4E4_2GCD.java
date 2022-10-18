//user defined package
//package com.packages;

import java.util.Scanner;

/*The class Edition12C4E4_2GCD is
 *calculating the distance between 
 *two points on the surface of a sphere.
 */
public class Edition12C4E4_2GCD
{
	public static double distance(double Point_1_lat, double Point_2_lat, double Point_1_lon, double Point_2_lon)
	{

		Point_1_lat = Math.toRadians(Point_1_lat);
		Point_2_lat = Math.toRadians(Point_2_lat);
		Point_1_lon = Math.toRadians(Point_1_lon);
		Point_2_lon = Math.toRadians(Point_2_lon);

		//formula to calculate the distance 
		double lat = Point_2_lat - Point_1_lat;
		double lon = Point_2_lon - Point_1_lon;
		
		double x = Math.pow(Math.sin(lat / 2), 2) + Math.cos(Point_1_lat) * Math.cos(Point_2_lat) * Math.pow(Math.sin(lon / 2),2);    
		double y = 2 * Math.asin(Math.sqrt(x));
		double z = 6371.01;
		return (y * z);
	}
	
	//main method
    public static void main (String[] args)
    {
    	//create scanner object
        Scanner in = new Scanner(System.in);

        System.out.println("//Calculating the distance between two points on the surface of a sphere//\n");
        System.out.print("Enter the number values(degrees) for point 1 latitude and longitude with space and without parenthsis: ");
        double Point_1_lat = in.nextDouble();
        double Point_1_lon = in.nextDouble();
        System.out.print("Enter the number values(degrees) for point 2 latitude and longitude with space and without parenthsis:");
        double Point_2_lat = in.nextDouble();
        double Point_2_lon = in.nextDouble();
    
        //Display the result on the console
        System.out.println("The distance between the two points " +Point_1_lat+ "," +Point_1_lon+ " and " +Point_2_lat+ "," +Point_2_lon+ " is "+distance(Point_1_lat, Point_2_lat, Point_1_lon, Point_2_lon) + "km");    
    }
    
}
