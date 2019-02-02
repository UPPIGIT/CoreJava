package com.corejava.variablesDemo;

public class InstanceVariables {

	int a = 200;
	int b = 500;

	void M1() {

		System.out.println(a);
		System.out.println(b);
	}

	static void M2() {
		InstanceVariables ob = new InstanceVariables();

		/*
		 * System.out.println(a); System.out.println(b); we cann't access ins varibales
		 * in static area
		 */
		System.out.println(ob.a);// using objct we can access
		System.out.println(ob.b);
	}

	public static void main(String[] args) {

		InstanceVariables in = new InstanceVariables();
		in.M1();
		M2();

	}

}
