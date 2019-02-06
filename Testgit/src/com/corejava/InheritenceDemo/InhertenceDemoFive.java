package com.corejava.InheritenceDemo;

class Base {
	String str = "Non static variable in super class";
	static String str1 = "static variable in super class";

	{

		System.out.println("I am IIB in super class");
	}

	static {
		System.out.println("I am SIB in super class");
	}

	public Base() {

		System.out.println("Super class cons");
	}

	public void IIBMethod() {
		System.out.println("non static method in super class");
	}

	public static void SIBMethod() {
		System.out.println("static method in super class");
	}

}

class Derived extends Base {

	String s1 = "Non static variable in Sub class";
	static String s2 = "static variable in Sub class";

	{

		System.out.println("I am IIB in Sub class");
	}

	static {
		System.out.println("I am SIB in Sub class");
	}

	public Derived() {

		System.out.println("Sub class cons");
	}

	void methodOne() {
		System.out.println("non static method in subclass");
	}

	static void methodTwo() {
		System.out.println("static method in subclass");
	}

	@Override
	public void IIBMethod() {
		// TODO Auto-generated method stub
		System.out.println("I am override method of super class");
	}

}

public class InhertenceDemoFive {

	public static void main(String[] args) {

		/*
		 * System.out.
		 * println("1.check Parent p = new Parent() : with this object we can access only parent class members only"
		 * );
		 * 
		 * Base base = new Base(); System.out.println(base.str);
		 * System.out.println(base.str1); base.IIBMethod(); base.SIBMethod();
		 * System.out.println(
		 * "===============================================================");
		 */

		/*
		 * System.out.
		 * println("2. check Child c = new Child() : with this object we acces both parent and child"
		 * ); Derived c = new Derived();
		 * 
		 * System.out.println(c.str); System.out.println(c.str1);
		 * System.out.println(c.s1); System.out.println(c.s2);
		 * 
		 * c.IIBMethod(); c.SIBMethod();
		 */
  
		System.out.println(
				"3. check Parent p = new Child() : with this object we can access super and sub class SIB,IIB and cons and super class variables and super class method");

		Base b = new Derived();
		System.out.println(b.str);
		System.out.println(b.str1);
		/*
		 * System.out.println(b.s1); System.out.println(b.s2);
		 */

		b.IIBMethod();// if method overridden from super class . child class method executed
		b.SIBMethod();
		
		System.out.println("check Child c = (Parent)new Parent()  :throws  java.lang.ClassCastException");
		/*Derived c = (Derived) new Base();*/

	}

}
