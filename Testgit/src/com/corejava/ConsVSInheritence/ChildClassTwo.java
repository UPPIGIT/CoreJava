package com.corejava.ConsVSInheritence;

public class ChildClassTwo extends ParentClass {

	int x=250;
	static int y=550;
	public ChildClassTwo(String s) {
		super(s);
		
	}
	
	void M1()
	{
		System.out.println(x+"------"+y);// only child class varibles access here
		System.out.println(super.x+"----------"+super.y);//parent class variables
	}

	public static void main(String[] args) {
		
		ChildClassTwo childClassTwo = new ChildClassTwo("anc");
		childClassTwo.M1();

	}

}
