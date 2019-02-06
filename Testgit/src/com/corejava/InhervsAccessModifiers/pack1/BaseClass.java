package com.corejava.InhervsAccessModifiers.pack1;

public class BaseClass {
	
	{
		System.out.println("Super class IIB-pak1");
	}
	
	static
	{
		System.out.println("Super class SIB -pak1");
	}
	
	public BaseClass() {
		System.out.println("Super class cons");
	}

	
	public static void M1()
	{
		System.out.println("public method in pk1");
	}
	
	private static void M2()
	{
		System.out.println("protected method in pk1");
	}
	
	static void  M3()
	{
		System.out.println("default method in pk1");
	}
	
	protected static void M4()
	{
		System.out.println("protected method in pk1");
	}
}
