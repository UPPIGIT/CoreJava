package com.corejava.WrapperClassesDemo;

public class AutoBoxingAndWiddening {
	
	public static void M1(Integer I)
	{
		System.out.println("Auto boxing......");
	}

	public static void M1(long l)
	{
		System.out.println("widening-.....");
	}
	
	public static void M1(int...x)
	{
		
		System.out.println("var arg method");
	}
	
	
	public static void M2(Long L)
	{
		System.out.println("Auto boxing.....");
	}
	
	public static void M2(long...l)
	{
		System.out.println("var arga method");
	}
	
	public static void main(String[] args) {
	
		AutoBoxingAndWiddening.M1(10); // int -- long ---> widening
		AutoBoxingAndWiddening.M2(10l);
		//AutoBoxingAndWiddening.M1(10.5f); float--double or Float --there is no method with this combination
	}

}

/*widening dominates Auto boxing
 * widening dominates var arg method]
 * auto boxing dominates the var arg*/
