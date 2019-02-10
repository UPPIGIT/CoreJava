package com.corejava.MethodOverride;

/*Child class method return type need not be same as parent class return type
 * Its child type also allowed from v1.5 . thid concept is applicable only for object not for primitive types*/

class ParentClass
{
	public Object methodOne()
	{
		System.out.println("Object return type in super class");
		return new Object();
	}
	
	
}

class ChildClass extends ParentClass
{
	@Override
	public String methodOne()
	{
		System.out.println("String return type in subclass");
		return new String();
	}
	


}

public class MethodOverrideDemoTwo {

	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		c.methodOne();
		

	}

}
