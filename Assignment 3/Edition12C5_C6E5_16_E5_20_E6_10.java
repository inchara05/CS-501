//self-defined package
//package com;

//import java.util.Arrays;
import java.util.Scanner;

/* The class Edition12C5_C6E5_16_E5_20_E6_10 
 * displays first 50 Prime Numbers,checks whether 
 * the number is Prime or not & returns Factors of 
 * non-prime number*/
public class Edition12C5_C6E5_16_E5_20_E6_10 {

	/** Main method */
	public static void main(String[] args) {
		
		System.out.println("/* This program displays first 50 Prime Numbers,checks whether the num is Prime or not & returns Factors of non-prime num*/\n");  
		System.out.println("Displaying the First 50 Prime Numbers:\n");
		display();
		System.out.println();
		Scanner inp = new Scanner(System.in);
		int repeat = 1;
		while (repeat == 1) {
//		System.out.println("\nPopulated an array containing the prime numbers less than 1000:\n");
//		populate(1000);
		checkArray();
		System.out.println("\nDo you want to repeat the program?(Enter 1 for Yes or 0 for No):");
		repeat = inp.nextInt();
	}
	}
	//Displays the First 50 Prime Numbers
	public static void display() 
	{
		int prime = 0;
		for (int i = 1; i < 230; i++) 
		{
			if (isPrime(i + 1)) 
			{
				System.out.print((i + 1) + " ");
				prime++;
				if (prime % 8 == 0) 
				{
					System.out.println();
				}
			}
		}
	}
	
	//checks if the number is prime or not
	public static boolean isPrime(int num) 
	{
		int div;
		for(div = 2; div <= num / 2; div++) 
		{
			if(num % div == 0) 
			{ 
				return false; 
			}
		}
		return true; 
	}

	
	//populating the array 
    static int[] arr = new int[1000];
    static int cnt = 0;
  
    public static void populate(int pop) 
    {
        int[] flag = new int[pop];
  
        for (int i = 2; i < pop; i++) 
        {
            if (flag[i] == 0) 
            {
                arr[cnt++] = i;
                int res = pop / i;
                for (int j = 2; j < res; j++) 
                {
                    flag[i * j] = 1;
                }
            }
        }
        for (int i = 0; i < cnt; i++) 
        {
            System.out.print(arr[i] + " ");
            if (i % 10 == 0)
                System.out.println();
        }
     }
    
    public static void checkArray(){
    	int a;
    	
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("\nEnter a number between 2 to 1000:");
		int num=scan.nextInt();
       
        while(num >=1000) {
        	System.out.println("Invalid Number");
        	System.out.println("Please enter a number only between 2 to 1000:");
        	num = scan.nextInt();  	
        }
        
    	for(int i=2;i<=num/2;i++)
		{
	           a=num%i;
		   if(a==0)
		   {
		      isPrime=false;
		      break;
		   }
		   
		}
		//if it is present in array then the number is prime else not
		if(isPrime) {
		   System.out.println(num + " is a Prime Number");}
		else {
		   System.out.println(num + " is not a Prime Number");
		   System.out.println("\nThe factors of " +num + " is:");
		   findFactor(num);
		   System.out.println();
		}
	   }
    
    
public static void findFactor(int fact) {
	int i = 1;
	while (i <= fact) {
		if (fact % i == 0)

			System.out.print(i + "\t");
		i++;
	}

}
}
