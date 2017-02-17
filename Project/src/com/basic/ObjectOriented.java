package com.basic;

//To keep the classes compact, you can use nested classes,
//though it makes instantiation a bit less readable.
public class ObjectOriented {

	public class ParentClass {
		
		int parentValue = 10;
		
		public void myPrint() {
			System.out.println("This is printed as a ParentClass.");
		}
		
		public void parentPrint () {
			System.out.println("Printing as a ParentClass again.");
		}
	}
	
	public class ChildClass extends ParentClass {
		
		@Override
		public void myPrint() {
			System.out.println("I am overriding behavior from my parent.");
		}
		
		public void childPrint() {
			System.out.println("Printing from ChildClass!");
		}
	}
}
