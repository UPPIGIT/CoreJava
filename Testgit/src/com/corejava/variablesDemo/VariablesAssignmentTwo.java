package com.corejava.variablesDemo;

public class VariablesAssignmentTwo {

	int a = 10;
	int b = 20;
	static int c = 30;
	static int d = 40;

	void M1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

	static void M2() {

		System.out.println(new VariablesAssignmentTwo().a);
		System.out.println(new VariablesAssignmentTwo().b);
		System.out.println(c);
		System.out.println(d);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new VariablesAssignmentTwo().M1();
		M2();

	}

}
