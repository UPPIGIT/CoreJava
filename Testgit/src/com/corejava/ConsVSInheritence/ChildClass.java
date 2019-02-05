package com.corejava.ConsVSInheritence;

public class ChildClass extends ParentClass {

	public ChildClass(String s) {
		super(s);//// parent class dont have any default cons. here super() is mandatory
		System.out.println("I am sub class one arg cons");
	}
	
	public ChildClass()
	{
		super("test");// parent class dont have any default cons. here super() is mandatory
		System.out.println("sub class no arg cons");
	}

	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();

	}

}
