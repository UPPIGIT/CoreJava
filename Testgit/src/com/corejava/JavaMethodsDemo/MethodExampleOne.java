package com.corejava.JavaMethodsDemo;

public class MethodExampleOne {

	// Methods 2 types--Inst and Static

	void M1() {

		System.out.println("Inst M1 method");
	}

	static void M2() {

		System.out.println("static  M2 method");
	}

	void M3(int a, int b) {
		
		System.out.println("Parameterized inst M3 method");
		System.out.println(a+"----------"+b);
		

	}
	
	static void  M4(String str ,float f)
	{
		
		System.out.println("Parameterized static M4 method");
		System.out.println(str+"----------"+f);
	}
	
	int M5()
	{
		System.out.println("M5 method with return type");
		return 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodExampleOne obj = new MethodExampleOne();
		obj.M1();
		
		MethodExampleOne.M2();
		
		obj.M3(10, 20);
		
		MethodExampleOne.M4("upender", 10.54f);
		
		obj.M5();
	}

}
