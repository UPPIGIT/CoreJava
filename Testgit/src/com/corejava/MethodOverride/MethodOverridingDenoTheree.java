package com.corejava.MethodOverride;

/*parent class private methods not availbe to the child class and hence overriding concept is not applicable to
 * for private methods
 * base on our requirement we can define exactly same private method in child class. 
 * It is valid but not overriding 
 * 
 * final method inherited to child class but can't override*/
class Base
{
	private void methodOne()
	{
		System.out.println("Private method in parent class");
	}
	
	public final void  methodTwo()
	{
		System.out.println("final method in super class");
	}
	
	public static void methodThree()
	{
		System.out.println("static method in super class");
	}
	
	public void methodFour()
	{
		System.out.println("non final method in super class");
	}
}

class MethodOverridingDenoTheree extends Base
{
	private void methodOne()
	{
		//super.methodOne();
		System.out.println("Private method in child class");
	}
	
/*	public final void  methodTwo()
	{
		System.out.println("final method in child class");
	}
	*/
	//@Override -- we cann't override super class static method in child class
	public static void methodThree()
	{
		System.out.println("static method in child class");
	}
	
	@Override
	
	public final void methodFour()
	{
		System.out.println("non final method inherited to child class as final");
	}
	
	public static void main(String[] args) {
		
		MethodOverridingDenoTheree derived = new MethodOverridingDenoTheree();
		derived.methodOne();
		derived.methodTwo(); //final method inherited to child class but can't override
		MethodOverridingDenoTheree.methodThree();//static methods inherited to child class but can't override. if we declare static method it its treated as new method
		derived.methodFour();
		
		Base base = new Base();
		//base.methodOne();
		
		Base base2 = new MethodOverridingDenoTheree();
		// base2.methodOne();
		
	}
}


