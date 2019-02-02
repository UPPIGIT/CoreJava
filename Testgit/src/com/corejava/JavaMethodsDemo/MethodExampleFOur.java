package com.corejava.JavaMethodsDemo;

public class MethodExampleFOur {
	
	//Calling one method from othe method
	
	void sal()
	{
		age();
		System.out.println("My sal is 12L");
	}
	
	void age()
	{
		name();
		System.out.println("My age is 29");
	}
	
	void name()
	{
		System.out.println("My name is Upendra");
	}
	
	
	public static void main(String[] args) {
		
		MethodExampleFOur obj = new MethodExampleFOur();
		obj.sal();
		
	}

}
