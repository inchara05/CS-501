//package com;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Edition12C10E10_13Rec {
		
	public static void main(String[] args) {
		run();
	}
	
	public static void run(){
		
		Scanner getInput = new Scanner(System.in);
		boolean repeat1 = true, repeat2 = true;
		MyRectangle2D r1 = null;
		MyRectangle2D r2 = null;
		System.out.println("This program will build a my rectangle 2D class that will perform 4 tests:\n");
		System.out.print("1. Whether one rectangle contains other rectangle\n");
		System.out.print("2. Whether test rectangle overlaps the base rectangle\n");
		System.out.print("3. Whether two rectangles are abut or not\n");
		System.out.println("4. Whether two rectangles are distinct or not\n");
		while(repeat1){
			System.out.println("Enter center point, width and height for base rectangle.(Note: Enter only numbers)\n");
			
			try {
					
					System.out.print("Enter x-coordinates : ");
					double x = getInput.nextDouble();
					System.out.print("Enter y-coordinates : ");
					double y = getInput.nextDouble();
					System.out.print("Enter width : ");
					double width = getInput.nextDouble();
					System.out.print("Enter height : ");
					double height = getInput.nextDouble();
					r1 = new MyRectangle2D(x, y, width, height);
					
					System.out.println("Area of base rectangle : "+r1.getArea());
					System.out.println("Perimeter of base rectangle : "+r1.getPerimeter());
				
			} catch (InputMismatchException ex) {
				getInput.nextLine();
				System.out.println("Invalid Input!!! Please enter a number");
			
			}
			catch(Exception ex)
			{
				getInput.nextLine();
				 System.out.println(ex.getMessage());
				System.out.println("Please enter again from start");
				continue;
			}

		
			
			while(repeat2) {
					System.out.println("\nEnter center point, width and height for test rectangle.(Note: Enter only numbers)\n");
					
					try {
						System.out.print("Enter x-coordinates : ");
						double _x = getInput.nextDouble();
						System.out.print("Enter y-coordinates : ");
						double _y = getInput.nextDouble();
						System.out.print("Enter width : ");
						double _width = getInput.nextDouble();
						System.out.print("Enter height : ");
						double _height = getInput.nextDouble();
						r2 = new MyRectangle2D(_x, _y, _width, _height);
						
						System.out.println("--Area of test rectangle : "+r2.getArea());
						System.out.println("--Perimeter of test rectangle : "+r2.getPerimeter());
						
						if(r1.contains(r2))
						{
							System.out.println("\n1. A test rectangle contains the base rectangle");
						}else if(r2.contains(r1))
						{
							System.out.println("\n1. A base rectangle contains1 the test rectangle");
						}else
						{
							System.out.println("\n1. No rectangle contains other rectangle");
						}
						if(r1.overlaps(r2))
						{
							System.out.println("2. Two rectangles overlaps");
						}else
						{
							System.out.println("2. Two rectangles does not overlaps");
						}			
						if(r1.abutment(r2))
						{
							System.out.println("3. Two rectangles are abut");
						}else {
							System.out.println("3. Two rectangles are not abut");
						}
						if(r1.distinct(r2))
						{
							System.out.println("4. Two rectangles are Distinct");
						}
						else 
						{
							System.out.println("4. Rectangles are not Distinct");
						}
						}catch (InputMismatchException ex) {
							getInput.nextLine();
							System.out.println("Invalid Input!!! Please enter a number\n");	
					}
					catch (Exception ex)
					{
						getInput.nextLine();
						 System.out.println(ex.getMessage());
						System.out.print("Please try again from start\n");
						continue;
					}
				
					System.out.println("\nDo you want to test again with same base rectangle values and "
							+ "different test rectangle values ?(Yes = 1, No = 0)");
					int _choice = getInput.nextInt();
					if(_choice == 1){
						repeat2 = true;
					}else if(_choice == 0){
						repeat2 = false;
					}
					
				}
			System.out.println("\nDo you want to try with new base rectangle? (Yes = 1, No = 0)");
			int _choice = getInput.nextInt();
			if(_choice == 1){
				repeat1 = true;
				repeat2 = true;
			}else if(_choice == 0){
				repeat1 = false;
				repeat2 = false;
			}
			
			}
		getInput.close();
		}
	}