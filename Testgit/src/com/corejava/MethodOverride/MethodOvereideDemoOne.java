package com.corejava.MethodOverride;

/*note : In overrridng method resoltion take care by run time object*/

class Parent {
	public void M1() {
		System.out.println("Parent M1 method");
	}
}

class Child extends Parent {

	@Override
	public void M1() {
		System.out.println("Child M1 method");
	}

}

public class MethodOvereideDemoOne {
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		Parent parent2 = new Child();
		parent.M1();
		child.M1();
		parent2.M1();
	}
}
