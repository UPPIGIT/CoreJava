package com.corejava.InheritenceDemo;

/*Constructors, SIB – Static Initialization Block and IIB – Instance 
 * Initialization Block of super class will not be inheriting to its sub class. 
 * But they are executed while creating an object to sub class. For example*/

class Parent{
	
	{
		System.out.println("super class IIB");
	}
	
	static
	{
		System.out.println("super class SIB");
	}
	
	public Parent() {
		System.out.println("super class constructor");
	}
}

class Child extends Parent
{
	int j;
}


public class InheritenceDemoTwo {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		

	}

}


/*super class SIB
super class IIB
super class constructor*/