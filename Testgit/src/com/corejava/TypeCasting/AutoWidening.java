package com.corejava.TypeCasting;

public class AutoWidening {
	
	public static float methodOne(int i)
	{
		long l=i;// int auto widened to long
		return l;//long auto widened to float
	}

	public static void main(String[] args) {
		
		byte b=2;
		short s= b; //byte auto widened to short
		
		double d= methodOne(s); //short is auto widened to int and float auto widened to double
		System.out.println(d);

	}

}
