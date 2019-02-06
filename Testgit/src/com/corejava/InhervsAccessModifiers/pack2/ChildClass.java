package com.corejava.InhervsAccessModifiers.pack2;


import com.corejava.InhervsAccessModifiers.pack1.ParentClass;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {

		System.out.println("Child class object in pack2");

		ChildClass c = new ChildClass();
		System.out.println(c.st1);// public vars visible to all classes
		System.out.println(c.st4);// Protected - any subclass --inherited

		System.out.println("Parent class object");

		ParentClass p = new ParentClass();
		System.out.println(p.st1); // with parent class Objct only public vars accessib
		
		System.out.println("static variable inheritence using child class object in pak1");

		System.out.println(c.str);
		//System.out.println(c.str3);
		System.out.println(c.str4);

		System.out.println("static variable inheritence using parent class object in pak1");
		System.out.println(p.str);
		//System.out.println(p.str3);
		System.out.println(p.str4);
		  
		  

		
		/*ChildClass c = new ChildClass();
		c.M1();
		//c.M3();
		c.M4();
		
		ParentClass p = new ParentClass();
		p.M1();
		//p.M3();
		//p.M4();
		
		ParentClass p1 = new ChildClass();
		p1.M1();
		//p1.M3();
		//p1.M4();
*/		
		
	}

}
