package com.corejava.MethodOverLoading;


/*note :In method overloading method resolution always take care by compiler 
 * based on reference type 
 * In method overloading runtime object wont play any role*/

class Parent
{}
class child extends Parent
{
}
public class MethodOverloadingDemoSix {
	
	public void methodOne(Parent parent)
	{
		System.out.println("Parent version");
	}
	
	public void methodOne(child child)
	{
		System.out.println("Child verion");
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemoSix demoSix = new MethodOverloadingDemoSix();
		
		Parent parent = new Parent();
		demoSix.methodOne(parent);
		child child = new child();
		demoSix.methodOne(child);
		Parent parent2 = new child();
		demoSix.methodOne(parent2);// here called Parent version only
	}

}
