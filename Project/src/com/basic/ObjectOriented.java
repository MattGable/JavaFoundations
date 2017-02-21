package com.basic;

//To keep the classes compact, you can use nested classes,
//though it makes instantiation a bit less readable.
public class ObjectOriented {

	public class ParentClass {
		
		int parentValue = 10;
		
		public void myPrint() {
			System.out.println("This is printed as a ParentClass.");
		}
		
		public void parentPrint() {
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
	
	public class Encapsulation {
		
		private int myData = 10;
		
		public int getData() {
			//Since int is immutable in Java, we can return
			//myData safely.
			return myData;
		}
		
		public void setData(int inputData) {
			myData = inputData;
		}
		
		public void printData() {
			System.out.println("myData = " + myData);
		}
	}
	
	public class AbstractedDog {
		
		private int XCoordinate;
		private int YCoordinate;
		private boolean tailIsWagging = false;
		
		public void bark() {
			
			System.out.println("Bark!");
		}
		
		public void moveRight() {
			
			XCoordinate++;
		}
		
		public void wagTail() {
			
			tailIsWagging = true;
		}
	}
}
