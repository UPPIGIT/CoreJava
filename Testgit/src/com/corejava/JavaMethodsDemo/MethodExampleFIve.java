package com.corejava.JavaMethodsDemo;

public class MethodExampleFIve {

	// Inst vs Local vars

	int x = 100;
	int y = 200;

	void M1(int x, int y) {

		System.out.println(x + y);// local variable give high priority
		System.out.println(this.x + this.y);// inst varas
	}

	static int a = 100;
	static int b = 200;

	static void M2(int a, int b) {

		System.out.println(a + b);
		// System.out.println(this.a); cant use this here
		System.out.println(MethodExampleFIve.a + MethodExampleFIve.b);
		// System.out.println(this.x); inside static method we cant use this keyword

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExampleFIve obj = new MethodExampleFIve();
		obj.M1(2000, 50000);
		M2(1014, 2014);
	}

}
