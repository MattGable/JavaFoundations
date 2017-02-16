package com.basic;

public class FlowControl {

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
