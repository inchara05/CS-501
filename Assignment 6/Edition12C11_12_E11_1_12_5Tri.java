//package com;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Edition12C11_12_E11_1_12_5Tri {
	public static void main(String[] args) {
		boolean continueProgram = true;
		int cycle2 = 1;
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
				System.out.println("This program displays the\n"
						+ "--AREA\n"
						+ "--PERIMETER\n"
						+ "--COLOR of the given triangle\n"
						+ "--True or False to indicate whether it is FILLED or NOT"
								+ "\n\nPress 1 if you wish to continue or 0 to exit:");
				cycle2 = input1.nextInt();
				if (cycle2 == 1) {
					while (continueProgram) {
						try {
							String result = "";
							String input = JOptionPane
									.showInputDialog(
											null,
											"1. Enter three sides of the triangle(Only numbers)\n2. A color name\n3. Boolean value(true or false) "
											+ "to indicate whether the triangle is filled or not.\n"
											+ "Note: The values entered must be in a single line separated with spaces.",
											"Input", JOptionPane.QUESTION_MESSAGE);
							String[] inputPoints = input.split(" ");
							if (!inputPoints[4].equals("true") && !inputPoints[4].equals("false")) {
								Exception e = new Exception(
								"Incorrect input. Please enter true or false to indicate whether the triangle is filled.");
								throw e;
							}
							double s1 = Double.parseDouble(inputPoints[0]);
							double s2 = Double.parseDouble(inputPoints[1]);
							double s3 = Double.parseDouble(inputPoints[2]);
							if(s1+s2 <= s3 || s2+s3 <= s1 || s1+s3 <= s2) {
							IllegalTriangleException thrEx = new IllegalTriangleException("In a triangle, the sum of any "
										+ "two sides must be greater than the other side.");
								throw thrEx;
							}
							String color = inputPoints[3];
							//System.out.println(Boolean.parseBoolean(inputPoints[4]));
							boolean filled = Boolean.parseBoolean(inputPoints[4]);
							Triangle triangle = new Triangle(s1, s2, s3, color, filled);
							result = triangle.toString()+"\n"
									+"Area of the triangle: "+triangle.getArea()+"\n"
									+"Perimeter of the triangle: "+triangle.getPerimeter()+"\n"
									+"Color of the triangle: "+triangle.getColor()+"\n"
									+"Triangle is filled? "+triangle.isFilled()+"\n";
							JOptionPane.showMessageDialog(null, result, "Result",
									JOptionPane.INFORMATION_MESSAGE);
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null,
									"Please retry with different input.\nMessage: " + e.getMessage(),
									"Exception", JOptionPane.ERROR_MESSAGE);
						}
						int confirm = JOptionPane.showConfirmDialog(null,
								"Do you want to repeat the program?",
								"Repeat confirmation", JOptionPane.YES_NO_OPTION);
						if (confirm == 0)
							continueProgram = true;
						else
							continueProgram = false;
					}

				}
	}
			}