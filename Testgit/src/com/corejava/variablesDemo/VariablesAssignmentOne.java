package com.corejava.variablesDemo;

public class VariablesAssignmentOne {
	
	int a=100;
	int b=200;
	
	static void M1()
	{
		VariablesAssignmentOne t = new VariablesAssignmentOne();
		System.out.println(t.a);
		System.out.println(t.b);
	}
	
	//Note : Above object is destroyed when method complete
	
	static void M2()
	{
		VariablesAssignmentOne t = new VariablesAssignmentOne();
		
		System.out.println(t.a);
		System.out.println(t.b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M1();
		M2();
		
		//Note : we can access static variable directly or using class name
		
		VariablesAssignmentOne.M1();
		VariablesAssignmentOne.M2();

	}

}
