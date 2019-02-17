package com.corejava.TypeCasting;

public class ExplicitlyNarrowing {
	
	public static short methodOne(long l)
	{
		int i =(int)l;// long explicitly narrowed to int
		short s=(short)i;// int explicitly narrowed to short
		return s;
	}

	public static void main(String[] args) {
	
		double d=10.5;
		float f = (float)d;// double explicitly narrowed to float
		
		byte b=(byte)methodOne((long)f);// float explicitly narrowed to long and short explicitly narrowed to byte
		System.out.println(b);

	}

}
