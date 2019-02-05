package com.corejava.ConstructorDemo;

public class Test {
	
	Test()
	{
		System.out.println("defalut cons");
	}
	
	Test(int a)
	{
		System.out.println("one arg cons");
	}
	
	Test(String a, int b)
	{
		System.out.println("two arg cons");
	}

	void Test()
	{
		System.out.println("This is method not a cons .Not recommended");
	}
	public static void main(String[] args) {
		
		Test test = new Test();
		Test test2= new Test(10);
		Test test3 = new Test("uppi", 100);
		

	}

}
