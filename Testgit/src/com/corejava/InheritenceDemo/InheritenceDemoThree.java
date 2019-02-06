package com.corejava.InheritenceDemo;
/*
You will get a compile time error saying implicit default constructor A() is undefined for Class A. 
Compiler will force you to write constructor in Class B. Because, we are not defining constructor for Class B. 
So, compiler will be providing default constructor. In that default constructor, first statement is super() –
it is a calling statement to default constructor of Class A. But it is not defined in Class A.
Therefore you will get a compile time error. To avoid this error, write the constructor for sub class. 
From that constructor call super class constructor explicitly. See the below code,*/

class BaseClass{
	
	public BaseClass(int a) {

		System.out.println("arg cons in superclass");
	}


}

class DerivedClass extends BaseClass
{
	public DerivedClass() {
		super(10);
		System.out.println("compiler give error if we remove super ");
	}
	
}

public class InheritenceDemoThree {

	public static void main(String[] args) {
		
		DerivedClass derivedClass = new DerivedClass();

	}

}
