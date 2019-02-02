package com.corejava.variablesDemo;

public class VariavbesVsDefaultvals {

	// Ins vars
	int a;
	int b;
	boolean bl;

	// static vars
	static int c;
	static int d;
	static boolean bln;

	public static void main(String[] args) {

		int a;
		int b;

//		Note : local vars must be initialized before first user

		/*
		 * System.out.println(a); System.out.println(b);
		 */

		System.out.println(new VariavbesVsDefaultvals().a);
		System.out.println(new VariavbesVsDefaultvals().b);
		System.out.println(new VariavbesVsDefaultvals().bl);
		System.out.println(c);
		System.out.println(d);
		System.out.println(bln);

	}
}

/*
 * 0 0 false 0 0 false
 */
