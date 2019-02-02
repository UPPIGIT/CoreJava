package com.corejava.variablesDemo;

public class LocalVariables {

	void M1() {
		int a = 40;
		int b = 50;

		System.out.println(a);
		System.out.println(b);
	}

	void M2() {
		/*
		 * System.out.println(a); System.out.println(b); local variables scope is with
		 * in that method only
		 */
	}

	public static void main(String[] args) {

		LocalVariables lobj = new LocalVariables();
		lobj.M1();
		lobj.M2();

	}

}
