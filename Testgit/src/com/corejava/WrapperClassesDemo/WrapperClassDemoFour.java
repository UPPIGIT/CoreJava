package com.corejava.WrapperClassesDemo;

/*parseXXX()  --String ---- primitive  -- all wrapper classes except character class contains this method
 * parseXXX(String s)
 * parseXXX(String s, int radix)*/

public class WrapperClassDemoFour {

	public static void main(String[] args) {

		String s = "10";

		int i = Integer.parseInt(s);
		int i1 = Integer.parseInt("1111", 2);
		
		System.out.println(i+"====="+i1);
		
		float f	=Float.parseFloat(s);
		double d=Double.parseDouble(s);
		boolean b= Boolean.parseBoolean(s);
		
		System.out.println(f+"=========="+d+"==========="+b);
		
		String s1= "ten";
		/*Integer.parseInt(s1);java.lang.NumberFormatException:*/

	}

}
