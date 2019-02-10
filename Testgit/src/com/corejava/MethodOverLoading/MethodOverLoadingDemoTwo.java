package com.corejava.MethodOverLoading;

/*
Automatic promotion in method Overloading

byte--short--int--long--float--double
	  char--
*/
public class MethodOverLoadingDemoTwo {

	public void methodOne(int i) {
		System.out.println("int arg method");
	}
	
	public void methodOne(float f)
	{
		System.out.println("float arg method");
	}

	public  static void main(String[] args) {
		
		MethodOverLoadingDemoTwo demoTwo = new MethodOverLoadingDemoTwo();
		demoTwo.methodOne(10);
		demoTwo.methodOne(10.5f);
		demoTwo.methodOne('a');
		demoTwo.methodOne(147895699999999l);
		//demoTwo.methodOne(15.58);CE
		

	}

}

/*int arg method
float arg method
int arg method
float arg method
*/
