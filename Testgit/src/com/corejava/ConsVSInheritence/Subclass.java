package com.corejava.ConsVSInheritence;

public class Subclass extends Superclass {

	public Subclass() {
		System.out.println("I am subclass cons");
	}
	
	public Subclass(String s)
	{
		System.out.println("I am sub class one arg cons");
	}

	public static void main(String[] args) {

		Subclass subclass = new Subclass();
		/*
		 * I am super class cons 
		 * I am subclass cons
		 */
		System.out.println("---------------------");
		
		Subclass subclass2= new Subclass("sruthi");
		
		/*I am super class cons
		I am sub class one arg cons*/
		

	}

}
