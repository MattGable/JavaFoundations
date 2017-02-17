package com.basic;

public class ObjectOriented {

	public class ParentClass {
		
		//Abstract classes can also have their own fields.
		int parentValue = 10;
		
		public void myPrint () {
			System.out.println("This is printed as a ParentClass.");
		}
		
		public void parentPrint () {
			System.out.println("Printing as a ParentClass again.");
		}
		
	}
	
	public class ChildClass extends ParentClass {
		
		@Override
		public void myPrint () {
			System.out.println("I am overriding behavior from my parent.");
		}
		
		public void childPrint () {
			System.out.println("Printing from ChildClass!");
		}
	}
}
