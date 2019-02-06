package com.corejava.InheritenceDemo.pack1;

import com.corejava.InheritenceDemo.pack2.myChild;

public class myParent {
	
	static
	{
		System.out.println("Parent SIB starts here===========");
		myChild.M1();
		myChild.M1();
		System.out.println("Parent SIB ends here===========");
	}
	
	public static void M1()
	{
		System.out.println("static m1 method in parent class");
	}
	
	 public void M2()
	{
		System.out.println("non static m2 method in parent class");
	}

	public static void main(String[] args) {
		
	}

}
