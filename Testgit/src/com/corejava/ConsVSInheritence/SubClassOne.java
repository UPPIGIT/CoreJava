package com.corejava.ConsVSInheritence;

public class SubClassOne extends Superclass {

	public SubClassOne() {
		System.out.println("sub class no arg cons");
	}

	public SubClassOne(String s) {
		this();
		System.out.println("I am subclass one arg cons");
	}

	public static void main(String[] args) {

		SubClassOne subClassOne = new SubClassOne("test");
		System.out.println("-----------------");
		
		
		
	}

}
