package com.corejava.WrapperClassesDemo;


/*
 * String/Primitive -------------->Wrapper Object ---valueOf();
 * WrapperObject/Primitive ------------String  ---toString()
 * wrapper object -----------primitive ----xxxValue()
 * String ------------------primitive -----parseXXX() 
 * 
 * */

public class WrapperAllMethodsDemo {

	public static void main(String[] args) {

		/* String to primitive */

		String s = "10";

		int i = Integer.parseInt(s);
		float f = Float.parseFloat(s);

		/* primitive to String */

		String s1 = Integer.toString(i);
		String s2 = Float.toString(f);

		/* String to Object */

		String string = "100";
		Integer integer = Integer.valueOf(string);
		Float float1 = Float.valueOf(string);

		/* Object to String */
		String string2 = integer.toString();
		String string3 = float1.toString();
		
		/*primitive to Object*/
		Integer integer2=Integer.valueOf(10);
		Float float2 = Float.valueOf((float) 10.5);
		
		/*Object to premitivie*/
		
		Integer integer3 = new Integer(100);
		integer3.intValue();
		integer3.byteValue();
		integer3.shortValue();
		integer3.doubleValue();
		integer3.floatValue();
		integer3.longValue();
	}

}
