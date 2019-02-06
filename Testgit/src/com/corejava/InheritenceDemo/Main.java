package com.corejava.InheritenceDemo;

class Test {
	
	static
	{
		System.out.println("parent SIB executed");
	}
	
	{
		System.out.println("parent IIB excuted");
	}
	

}

 class ChildTest extends Test
{
	static
	{
		System.out.println("child SIB executed");
	}
	
	{
		System.out.println("child IIB excuted");
	}
	
	
	void M1()
	{
		System.out.println("child non static method");
	}
	
	static void M2()
	{
		System.out.println("child static method");
	}

}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	/*	System.out.println("================");
		//new ChildTest().M1();
		System.out.println("================");
		//ChildTest.M2();
*/		
		//Test t = new Test();
		System.out.println("=====================");
		
		//ChildTest ct = new ChildTest();
		
	 Test t= new ChildTest();

	}

}
