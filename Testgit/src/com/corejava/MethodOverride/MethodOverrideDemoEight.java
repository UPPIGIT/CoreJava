package com.corejava.MethodOverride;

/*variable resolution always take care by compiler based on reference type irrespective of whether the variable is 
 * static or non static
 * Note : Overriding method is only applicable for only for method but not for variables*/

class P
{
	int a=100;
	static int b=500;
}

class C extends P
{
	int a=100;
	static int b=500;
}

public class MethodOverrideDemoEight {

	public static void main(String[] args) {
		
		P p= new P();
		System.out.println(p.a);
		System.out.println(p.b);
		
		C c =new C();
		System.out.println(c.a);
		System.out.println(c.b);
		
		P p1 = new C();
		System.out.println(p1.a);
		System.out.println(p1.b);
		

	}

}

/*100
500
100
500
100
500
 */