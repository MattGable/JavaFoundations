package com.basic;

import java.util.Scanner;

public class BasicOperations {
	
	public static void PrintHello() {
		
		//Printing a line in Java.
		System.out.println("Printing a line.");
	}
	
	public static void GetUserInput() {
		
		//Instantiate a new Scanner object which gives us a lot
		//of extra options for getting user input
		//such as using delimiters for tokenizing our input.
		Scanner scan = new Scanner(System.in);
		
		//Getting user input in Java using a Scanner
		System.out.print("Please enter an input> ");
		String userInput = scan.nextLine();
		
		System.out.println("Your input was: " + userInput);
	}
	
	public static void HandleInputErrors() {
		
		//Initializing another scanner.
		Scanner scan = new Scanner(System.in);
		
		//"Try" to get the input, but if it's incorrect, catch
		//the Exception that is generated by unintended input.
		try {
			
			//Getting user input in Java using a Scanner
			System.out.print("Please enter a whole number> ");
			int userInput = scan.nextInt();
			
			System.out.println("Your input was: " + userInput);
		}
		//Catch *any* Exception generated by errors in the try block
		catch (Exception e){
			
			System.out.println("Something unexpected occured!");
		}
	}
}