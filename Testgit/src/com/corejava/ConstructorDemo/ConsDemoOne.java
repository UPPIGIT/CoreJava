package com.corejava.ConstructorDemo;

public class ConsDemoOne {
	
	public ConsDemoOne(String s ,int a)
	{
		System.out.println("arg cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsDemoOne consDemoOne= new ConsDemoOne("abc", 10);
		//ConsDemoOne consDemoOne2= new ConsDemoOne(); there is no default cons. so we can't create object like this

	}

}
