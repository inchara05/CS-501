//self-defined package
//package com;

import java.util.Scanner;

/* The class Edition12C7E7_9E7_10E7_20 returns
 * the minimum element, index of the minimum 
 * element and sorts the array in ascending order.
 */
public class Edition12C7E7_9E7_10E7_20 {

	// Main method
	public static void main(String[] args) {

		// create scanner object
		Scanner inp = new Scanner(System.in);
		int repeat = 1;
		double[] num = new double[10];
		System.out.println(
				"/*This Program will returns the minimum element, index of the minimum element and sorts the array in ascending order*/\n");
		while (repeat == 1) {

			// Prompt the user to enter ten numbers
			System.out.println("Enter ten numbers(integers/decimal/negative) with space and without parenthsis: ");
			for (int i = 0; i < num.length; i++)
				num[i] = inp.nextDouble();

			min(num);
			indexOfSmallestElement(num);

			// Displays the minimum value
			System.out.println("\nThe minimum number is: " + min(num));
			// Displays the index of minimum value
			System.out.println("The minimum number " + num[indexOfSmallestElement(num)] + " index is: "
					+ indexOfSmallestElement(num));
			System.out.print("Sorted array of numbers entered above: \n");

			// Displays the sorted numbers of the array entered by the user
			selectionSort(num);
			for (double e : num)
				System.out.print(e + " ");
			System.out.println();
			System.out.print("\nDo you want to repeat the program?(Enter 1 for Yes or 0 for No): \n");
			repeat = inp.nextInt();
		}
	}

	// Displays the smallest element in an array
	public static double min(double[] array) {
		double min = array[0];
		for (double i : array) {
			if (i < min)
				min = i;
		}
		return min;
	}

	// Displays the index of the smallest element in an array
	public static int indexOfSmallestElement(double[] array) {
		if (array.length <= 1)
			return 0;

		double min = array[0];
		int minIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	// Sorting the array in ascending order
	public static void selectionSort(double[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			double sortArr = list[i];
			int index = i;

			for (int j = i - 1; j >= 0; j--) {
				if (sortArr < list[j]) {
					sortArr = list[j];
					index = j;
				}
			}
			if (index != i) {
				list[index] = list[i];
				list[i] = sortArr;
			}
		}
	}
}
