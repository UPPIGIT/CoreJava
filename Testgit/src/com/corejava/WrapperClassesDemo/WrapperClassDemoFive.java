package com.corejava.WrapperClassesDemo;

/*toString() method is used to convert Wrapper Object to String */

public class WrapperClassDemoFive {

	public static void main(String[] args) {
		
		Integer I = new Integer(10);
		String s =I.toString();
		System.out.println(s);
		
		String s1 = Integer.toString(10);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		

	}

}
