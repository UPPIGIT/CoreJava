package com.corejava.MethodOverride;

/*while overriding we cann't reduce the scope of the access modifiers but we can increase the scope*/

class MyParent {
	public void M1() {
		System.out.println("public method in super class");
	}

	void M2() {
		System.out.println("default method in super class");
	}

	protected void M3() {
		System.out.println("protected method in super class");
	}
	
	private void M4()
	{
		System.out.println("private method in super class");
	}

}

class myChild extends MyParent
{
	@Override
	public void M1()
	{
		
		System.out.println("Override method access modifier should be Public");
	}
	
	@Override
	
	protected void M2()
	{
		System.out.println("super class default method access modifier should be default/public/protected only in override method");
	}
	
	protected void M3()
	{
		System.out.println("super class protected  method access modifier should be  public/protected only in override method");
	}
	
	/*@Override 
	public void M4()
	{
		System.out.println("private methods of super class not visible to child class");
	}*/
}

public class MethodOverrideDemoFive {

	public static void main(String[] args) {
		
		myChild child = new myChild();
		child.M1();
		child.M2();
		child.M3();

	}

}
