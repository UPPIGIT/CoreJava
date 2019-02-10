package com.corejava.MethodOverLoading;

public class MethodOverloadingDemoFour {
	
	public void methodOne(int i , float f)
	{
		System.out.println("int float method");
	}
	
	public void methodOne(float f, int i)
	{
		System.out.println("float int method");
		
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingDemoFour demoFour = new MethodOverloadingDemoFour();
		demoFour.methodOne(10, 15f);
		demoFour.methodOne(10.5f, 10);
		
	//	demoFour.methodOne(10, 10); both methods mathed CE
	//	demoFour.methodOne(10.5f, 12.5f); no methods matched CE
	}

}
