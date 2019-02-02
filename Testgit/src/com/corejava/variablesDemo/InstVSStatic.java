package com.corejava.variablesDemo;

public class InstVSStatic {

	int a=10;
	static int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstVSStatic obj1= new InstVSStatic();
		System.out.println(obj1.a);//10
		System.out.println(obj1.b);//20
		
		obj1.a=100;
		obj1.b=200;
		
		System.out.println(obj1.a);//100
		System.out.println(obj1.b);//200
		
		InstVSStatic obj2 = new InstVSStatic();
		System.out.println(obj2.a);//10
		System.out.println(obj2.b);//200
		
		InstVSStatic obj3 = new InstVSStatic();
		System.out.println(obj3.a);//10
		System.out.println(obj3.b);//200
		
		

	}

}

/*NOte :   single copy of static variables avaible to all objects
separate copy of inst var avaialbe to all objects*/

