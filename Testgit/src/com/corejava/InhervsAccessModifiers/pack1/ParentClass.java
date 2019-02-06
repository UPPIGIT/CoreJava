package com.corejava.InhervsAccessModifiers.pack1;

public class ParentClass {

	public String st1 = "public variable in pack1";
	private String st2 = "private variable in pack1";
	String st3 = "default variable in pack1";
	protected String st4 = "protected variable in pack1";
	
	
	public static String str = "public static variable in pack1";
    static	private String str2 = "private static variable in pack1";
	static String str3 = "default static variable in pack1";
	static protected String str4 = "protected static variable in pack1";
	
	public void M1()
	{
		System.out.println("public method in pk1");
	}
	
	private void M2()
	{
		System.out.println("protected method in pk1");
	}
	
	 void M3()
	{
		System.out.println("default method in pk1");
	}
	
	protected void M4()
	{
		System.out.println("protected method in pk1");
	}
	
	 
	

}
