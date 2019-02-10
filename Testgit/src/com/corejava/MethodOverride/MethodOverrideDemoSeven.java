package com.corejava.MethodOverride;

/*we can override var arg method with another var arg method only
 * if we trying to override with normal method it will become overloading not overriding */

class MyBase
{
	
	public void M1(int ...x)
	{
		System.out.println("var arg method in super class");
	}
}

class MyDerivedClass extends MyBase
{
	
	public void M1(int x)
	{
		System.out.println("it is overload method not overring");
		
	}
	@Override
	public void M1(int...x)
	{
		System.out.println("it is overriding var arg method......");
	}
}

public class MethodOverrideDemoSeven {

	public static void main(String[] args) {
		
		MyBase base = new MyBase();
		base.M1(10);
		MyDerivedClass class1 = new MyDerivedClass();
		class1.M1(10);
		class1.M1(10,5);
		
		MyBase base2 = new MyDerivedClass();
		base2.M1(10);
		
	}

}
