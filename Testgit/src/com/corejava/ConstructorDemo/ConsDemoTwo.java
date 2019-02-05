package com.corejava.ConstructorDemo;

public class ConsDemoTwo {
	
	/*Cons chaining*/
	
	public ConsDemoTwo() {
		this("Upender");
		System.out.println("default cons");
		//this("tadewar");not allowed : con call must be first state ment
	}
	
	public ConsDemoTwo(String s)
	{
		this(s,100);
		System.out.println("one arg cons");
	}
	
	public ConsDemoTwo(String s,int a)
	{
	//	this("CTS"); --recursive cons not allowed
		System.out.println("two arg cons :"+s+"-------"+a);
	}

	public static void main(String[] args) {
		
		ConsDemoTwo consDemoTwo = new ConsDemoTwo();
	}

}
