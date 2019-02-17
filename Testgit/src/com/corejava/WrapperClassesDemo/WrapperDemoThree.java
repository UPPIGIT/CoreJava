package com.corejava.WrapperClassesDemo;

/*xxxValue() ---Wrapper Object to Primitive
 * all number type wrapper classes (Byte,Short,Integer,Long,Double,Float) contains below 6 methods*/
public class WrapperDemoThree {

	public static void main(String[] args) {
		
		Integer integer = new Integer(10);
		
		System.out.println(integer.intValue());
		System.out.println(integer.byteValue());
		System.out.println(integer.shortValue());
		System.out.println(integer.floatValue());
		System.out.println(integer.doubleValue());
		System.out.println(integer.longValue());
		
		//Integer integer2 = new Integer("ten");java.lang.NumberFormatException
		
		
		Character character = new Character('a');
		System.out.println(character.charValue());
		
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean("durga");
		
		System.out.println(boolean1.booleanValue());
		System.out.println(boolean2.booleanValue());

	}

}
