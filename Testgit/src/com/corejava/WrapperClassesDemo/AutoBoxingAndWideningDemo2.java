package com.corejava.WrapperClassesDemo;

/*int--l/f/d ---Integer ---Number--Object*/

public class AutoBoxingAndWideningDemo2 {
	
	public static void M1(Object object)
	{
	System.out.println("Object version");	
	}
	
	public static void M1(Number num)
	{
		System.out.println("number version");
	}

	
	public static void M1(Integer I)
	{
		System.out.println("Integer version");
	}

	
	public static void M1(int a)
	{
		System.out.println("primitive version...");
	}



	public static void main(String[] args) {
		
		AutoBoxingAndWideningDemo2.M1(10);
		AutoBoxingAndWideningDemo2.M1(10.5);
		AutoBoxingAndWideningDemo2.M1("abc");
	}

}

/*primitive version...
number version
Object version
*/