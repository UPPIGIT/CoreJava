package com.corejava.MethodOverLoading;

/*In general var arg method will get least priority i.e if no other method matched then only var 
 * arg method will get chance*/

public class MethodOverloadingDemoFive {

	public void methodOne(int i) {
		System.out.println("General  method");
	}

	public void methodOne(int... x) {
		System.out.println("var arg method");

	}

	public static void main(String[] args) {
		MethodOverloadingDemoFive demoFive = new MethodOverloadingDemoFive();
		demoFive.methodOne(10);
		demoFive.methodOne(10, 5);
		demoFive.methodOne();
	}

}

/*
 * General method var arg method var arg method
 */