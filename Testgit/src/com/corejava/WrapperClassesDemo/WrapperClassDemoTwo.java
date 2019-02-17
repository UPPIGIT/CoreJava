package com.corejava.WrapperClassesDemo;

/* valueOf() method  -- primitive/String ------>Wrapper Object
 * 1. public static wrapper valueOf(String s)  -- all wrapper classes except Character class
 * 2. public static wrapper  valueOf(String s ,int radix) -- Integral type --Byte ,Short,Int , Long
 * 3. public static wrapper   valueOf(Premitive p) -- all wrapper classes*/

public class WrapperClassDemoTwo {

	public static void main(String[] args) {

		Integer I = Integer.valueOf(10);
		Integer integer = Integer.valueOf("45");
		Integer integer2 = Integer.valueOf("10", 2);
		System.out.println(I);
		System.out.println(integer);
		System.out.println(integer2);

		Integer integer3 = Integer.valueOf((int) 10.5);
		/* Integer integer4 = Integer.valueOf("ten"); java.lang.NumberFormatException */

		Float float1 = Float.valueOf("10.5");
		Float float2 = Float.valueOf((float) 10.5);
		Float float3 = Float.valueOf(10.5f);
		Float float4 = Float.valueOf(10);
		/* Float float5 = Float.valueOf("ten");java.lang.NumberFormatException */

		Boolean boolean1 = Boolean.valueOf("true");
		System.out.println(boolean1);
		Boolean boolean2 = Boolean.valueOf("TRUE");
		System.out.println(boolean2);
		Boolean boolean3 = Boolean.valueOf("tRue");
		System.out.println(boolean3);
		Boolean boolean4 = Boolean.valueOf("false");
		System.out.println(boolean4);
		Boolean boolean5 = Boolean.valueOf("FALSE");
		System.out.println(boolean5);
		Boolean boolean6 = Boolean.valueOf("fAlse");
		System.out.println(boolean6);
		Boolean boolean7 = Boolean.valueOf("false");
		System.out.println(boolean7);
		Boolean boolean8 = new Boolean("Durga");
		System.out.println(boolean8);
		Boolean boolean9 = new Boolean("yes");
		System.out.println(boolean9);
		
		Boolean boolean10 = Boolean.valueOf(true);
		Boolean boolean11 = Boolean.valueOf(false);
		//Boolean boolean12 = Boolean.valueOf(True);
		System.out.println(boolean10 +"======="+boolean11);
		
		Character character = Character.valueOf('a');
		// Character character2 = Character.valueOf("a");

	}

}
