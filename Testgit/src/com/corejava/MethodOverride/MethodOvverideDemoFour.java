package com.corejava.MethodOverride;

abstract class SuperClass
{
	abstract void M1();
	

}

class ChildClass1 extends SuperClass
{

	@Override
	void M1() {
		System.out.println("abstact method implemention in child class");
		
	}
}

class Par
{
	public void M1() {
		System.out.println("non absratc method in super class");
	}
}

abstract class Chi extends Par
{
	@Override
	
	public abstract void M1();
	
}

class Chi2 extends Chi
{
	@Override
	public void M1() {
		System.out.println("non absratc method in chi2 class");
	}	
}
public class MethodOvverideDemoFour {

	public static void main(String[] args) {
		
		SuperClass class1 = new ChildClass1();
		class1.M1();
		
		ChildClass1 childClass1 = new ChildClass1();
		childClass1.M1();
		
	//	SuperClass class2 = new SuperClass() ; we cann't create abstract class object
		
		Chi2 chi2 = new Chi2();
		chi2.M1();
		
	}

}
