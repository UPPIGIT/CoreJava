package com.corejava.MethodOverride;

class MyParent1
{
	public void M1(Object object)
	{
		System.out.println("Object as arg");
		
	}
	
	public void M1(Number number)
	{
		System.out.println("Number as arg");
		
	}
}
class MyChild1 extends MyParent1
{
	public void M1(Integer integer)
	{
		System.out.println("Integer as arg");
		
	}
	
	public void M1(Double double1)
	{
		System.out.println("Double as arg");
		
	}
}

public class MethodOverrideDemoNine {

	public static void main(String[] args) {
		
		MyChild1 child1 = new MyChild1();
		child1.M1((short)10); // no method as short as arg so called Number
		child1.M1(10);//int automatically promoted to integer
		child1.M1(10.5f);// no float so number arg called
		child1.M1(10.5);
		child1.M1("uppi");

	}

}

/*Number as arg
Integer as arg
Number as arg
Double as arg
Object as arg
*/