package com.corejava.MethodOverride;
/*note : we cann't override static metdos as non static and non static as static*/

class MySuperClass {
	public static void M1() {

		System.out.println("static M1 method in super class");
	}

	public void M2() {
		System.out.println("non static method in super class");
	}
}

class MySubclass extends MySuperClass {
	
/*	public void M1()
	{
		System.out.println("we cannt override static method as not static");
	}*/
	
	/*public static void M2()
	{
		System.out.println("cannt override non static as static");
	}
*/
}

public class MethodOverrideDemoSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
