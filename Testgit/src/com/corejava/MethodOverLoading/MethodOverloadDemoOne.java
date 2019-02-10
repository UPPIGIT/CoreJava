package com.corejava.MethodOverLoading;

public class MethodOverloadDemoOne {
	
	public void M1()
	{
		System.out.println("M1() method");
	}
	
	public void M1(int i)
	{
		System.out.println("M1(int) method");
	}
	
	public void M1(String str)
	{
		System.out.println("M1(String ) method");
	}
	
	public void M1(float f,int i)
	{
		System.out.println("M1(float ,int) method");
	}
	
	public void M1(int i ,float f)
	{
		System.out.println("M1(int ,float) method");
	}
	
	static void M1(long l)
	{
		System.out.println("static M1(long) method");
	}
/*	static void M1()
	{
		System.out.println("it is not a overloaded method");
	}
	
	private void M1()
	{
		System.out.println("it is not a overloaded method");
	}*/

	
	public static void main(String[] args) {
		
		MethodOverloadDemoOne demoOne= new MethodOverloadDemoOne();
		demoOne.M1();
		demoOne.M1(10);
		demoOne.M1("uppi");
		demoOne.M1(12f, 10);
		demoOne.M1(12, 10f);
		MethodOverloadDemoOne.M1(10l);
		
		
	}
}
