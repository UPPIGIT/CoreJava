package com.corejava.InheritenceDemo;

class Pclass
{
	static  String str="super class static variable";
	
	static void myMethod()
	{
		System.out.println("Super class static method");
	}
	
}

class Chclass extends Pclass
{
	int j;
}

public class InheritenceDemoFOur {

	public static void main(String[] args) {
		
		Chclass chclass = new Chclass();
		System.out.println(chclass.str);
		chclass.myMethod();
	}

}
