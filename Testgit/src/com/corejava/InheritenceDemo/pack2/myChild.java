package com.corejava.InheritenceDemo.pack2;

import com.corejava.InheritenceDemo.pack1.myParent;

public class myChild extends myParent {
	
	static
	{
		System.out.println("child SIB starts here=================");
		/*M1();
		myParent.M1();
		new myParent().M2();
		new myChild().M2();*/
		System.out.println("child SIB End here=================");
	}
	
	{
		System.out.println("child IIB starts here=============");
		/*M1();
		myParent.M1();
		M2();
		new myParent().M2();*/
		System.out.println("child IIB end here===================");
	}
	
	public static void M1()
	{
		System.out.println("static m1 method in child class");
	}
	
	 public void M2()
	{
		System.out.println("non static m2 method in child class");
	}
	 
	 public static void main(String[] args) {
		myChild c = new myChild();
	}

}
