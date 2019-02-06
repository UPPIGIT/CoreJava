package com.corejava.InhervsAccessModifiers.pack1;

public class ChildClass extends ParentClass {
	
	public static void main(String[] args) {
		
	/*	System.out.println("I am child class object in pack1");
		ChildClass c = new ChildClass();
		
	
		System.out.println(c.st1);//public -anywhere
		System.out.println(c.st3);//Default --with in pkg
		System.out.println(c.st4);//protected -- in subclass
		//System.out.println(c.st2); private variables are not inherited to subclass even in same pkg 
		
		System.out.println("using parent class object in sub class pak1");
		ParentClass p = new ParentClass();
		System.out.println(p.st1);
		System.out.println(p.st3);
		System.out.println(p.st4);
		//System.out.println(p.st2); we cann't access private var out side pks even with same class object
		
		
		System.out.println("static variable inheritence using child class object in pak1");
		
		System.out.println(c.str);
		System.out.println(c.str3);
		System.out.println(c.str4);
		
		System.out.println("static variable inheritence using child class object in pak1");
		System.out.println(p.str);
		System.out.println(p.str3);
		System.out.println(p.str4);*/
		
		
			ChildClass c = new ChildClass();
			c.M1();
			c.M3();
			c.M4();
			
			ParentClass p = new ParentClass();
			p.M1();
			p.M3();
			p.M4();
			
			ParentClass p1 = new ChildClass();
			p1.M1();
			p1.M3();
			p1.M4();
		
	}

}
