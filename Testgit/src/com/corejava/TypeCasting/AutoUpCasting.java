package com.corejava.TypeCasting;

class A
{}
class B extends A
{}
class C extends B
{}
class D extends C
{}

public class AutoUpCasting {

	public static void main(String[] args) {
		
		D d = new D();
		B b = d;// auto up casting
		C c = d;//Auto up casting
		A a =d;// auto up casting
		
		C cc = new C();
		B bb =cc;
		A aa =cc;
		
		System.out.println(d.hashCode()+"======"+b.hashCode()+"======="+c.hashCode()+"======"+a.hashCode());
		
		

	}

}
