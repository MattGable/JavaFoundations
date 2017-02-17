package com.basic;

import com.basic.ObjectOriented.ChildClass;
import com.basic.ObjectOriented.ParentClass;

public class Driver {

	public static void main (String [] args) {
		
		BasicOperations.printHello();
		BasicOperations.getUserInput();
		BasicOperations.handleInputErrors();
		
		FlowControl.ifElse();
		FlowControl.switchMethod();
		FlowControl.iteration();
		FlowControl.recursion();
		
		//Inheritance
		
		//Creating an instance of a ChildClass (from a nesting class).
		ChildClass myChildClass = new ObjectOriented().new ChildClass();
		
		//This overrides the same method from a parent.
		myChildClass.myPrint();
		//This happens only in a ChildClass.
		myChildClass.childPrint();
		//This is inherited from a ParentClass.
		myChildClass.parentPrint();
		
		//Polymorphism
		
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
	}

}
