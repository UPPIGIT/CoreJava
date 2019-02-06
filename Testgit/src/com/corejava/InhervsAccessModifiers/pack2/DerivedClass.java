package com.corejava.InhervsAccessModifiers.pack2;

import com.corejava.InhervsAccessModifiers.pack1.BaseClass;

public class DerivedClass extends BaseClass {

	public static void main(String[] args) {
		
		DerivedClass derivedClass = new DerivedClass();
		System.out.println("============================");
		BaseClass baseClass = new BaseClass();
		System.out.println("=================================");
		BaseClass baseClass2 = new DerivedClass();

		
		System.out.println("static methods");
		
		derivedClass.M1();
		derivedClass.M4();
				
		baseClass.M1();
		baseClass.M4();// note : protected methods visible to base class object out side pkg
		
		
		baseClass2.M1();
		baseClass2.M4();
		
	}

}
