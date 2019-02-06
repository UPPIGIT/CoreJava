package com.corejava.InheritenceDemo;

class SuperClass{
	
	String str1="I am Super class variable";
	
	public void M1()
	{
		System.out.println("I am super class method");
	}
	
}

class Subclass extends SuperClass
{
	String str2="I am subclass variable";
	
	public void M2()
	{
		System.out.println("I am subclass Method");
	}
	
	
}
public class InherirenceDemoOne {

	public static void main(String[] args) {
		
		Subclass subclass = new Subclass();
		System.out.println(subclass.str1);
		System.out.println(subclass.str2);
		subclass.M1();
		subclass.M2();

	}

}
