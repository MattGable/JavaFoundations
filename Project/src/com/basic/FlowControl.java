package com.basic;

public class FlowControl {
	
	public static void IfElse() {
		
		int someValue = 5;
		//An if/else if /else in Java
		if (someValue > 0) {
			System.out.println("'if' evaluated to true.");
		}
		else if (someValue < 0) {
			System.out.println("'if' was false AND 'else if' evaluated to true.");
		}
		else {
			System.out.println("'if' and 'else if' were both false.");
		}
	}
	
	public static void Switch() {
		
		//A switch statement in Java.
		//The entry point to the switch is where a case matches the
		//evaluand of the switch statement.
		//Without 'break', all cases below the entry point 
		//are executed.
		int someValue = 2;
		switch (someValue) {
		
		case 1: {
			System.out.println("someValue is 1.");
			break;
		}
		case 2: {
			System.out.println("someValue is 2.");
			break;
		}
		default: {
			System.out.println("someValue is somethign other than 1 or 2.");
		}
		}
	}

	public static void Iteration() {
		
		//A loop that prints its counter every iteration.
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Iterator i is: " + i);
		}
	}
	
	public static void Recursion() {
		
		//This Recursion method uses a simple factorial calculation.
		//Returns the factorial of a value, 10 in this case;
		System.out.println("The factorial of 10 is: " + Factorial(10));
	}
	
	private static int Factorial (int i) {
		
		if (i == 0) {
			return 1;
		}
		else {
			return i * Factorial(i - 1);
		}
	}
}
