package com.basic;

import com.basic.ObjectOriented.AbstractedDog;
import com.basic.ObjectOriented.ChildClass;
import com.basic.ObjectOriented.Encapsulation;
import com.basic.ObjectOriented.ParentClass;

public class Driver {

	public static void main (String [] args) {
		
		//==Basic operations (see classes for more info)
		
		BasicOperations.printHello();
		BasicOperations.getUserInput();
		BasicOperations.handleInputErrors();
		
		//==Flow control (see classes for more info)
		
		FlowControl.ifElse();
		FlowControl.switchMethod();
		FlowControl.iteration();
		FlowControl.recursion();
		
		//==Inheritance
		
		//Creating an instance of a ChildClass (from a nesting class).
		ChildClass myChildClass = new ObjectOriented().new ChildClass();
		
		//This overrides the same method from a parent.
		myChildClass.myPrint();
		//This happens only in a ChildClass.
		myChildClass.childPrint();
		//This is inherited from a ParentClass.
		myChildClass.parentPrint();
		
		//==Polymorphism
		
		//A child can still act like a parent.
		//If we cast child to parent, however, we still have child versions of parent methods, since its
		//original reference is for a ChildClass.
		ParentClass childToParent = (ParentClass)myChildClass;
		
		//ChildClass version.
		childToParent.myPrint();
		//ParentClass version (not implemented in ChildClass).
		childToParent.parentPrint();
		
		//However, we lose access to ChildClass-only methods!
		//This does not work without casting it to ChildClass.
		//childToParent.childPrint();
		
		//==Encapsulation
		
		//Our encapsulation object has data that is hidden
		//behind "walls". Its internal data is encapsulated.
		Encapsulation encapsulation = new ObjectOriented().new Encapsulation();
		
		//Printing the contents of the encapsulated object
		encapsulation.printData();
		//The data in Encapsulation is private, so we need
		//to use special methods to get at it. 
		encapsulation.setData(11);
		//The data is changed after setting it to a different value.
		encapsulation.printData();
		
		//==Abstraction
		
		//When we model complex reality into a representation in our
		//code, we are creating an abstraction.
		AbstractedDog dog = new ObjectOriented().new AbstractedDog();
		
		//Our abstract dog is a subset of its real-world
		//actions/traits.
		dog.bark();
		dog.moveRight();
		dog.wagTail();
	}

}
