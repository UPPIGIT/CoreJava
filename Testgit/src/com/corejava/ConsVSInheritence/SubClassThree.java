package com.corejava.ConsVSInheritence;

public class SubClassThree extends Superclass {
	
	public SubClassThree() {
		
		System.out.println("I am sub calss no arg cons");
	}

	public static void main(String[] args) {
		
		Superclass superclass = new Superclass();
		System.out.println("-------------------");
		SubClassThree subClassThree  = new SubClassThree();
		System.out.println("-----------------");
		//SubClassThree subClassThree2 = (SubClassThree) new Superclass();ClassCastException
		Superclass superclass2 = new SubClassThree();
		
		

	}

}

/*I am super class cons
-------------------
I am super class cons
I am sub calss no arg cons
-----------------
I am super class cons
I am sub calss no arg cons
*/
