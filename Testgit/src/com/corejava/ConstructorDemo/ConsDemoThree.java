package com.corejava.ConstructorDemo;

public class ConsDemoThree {
	
	int a;
	static int b;
	
	public ConsDemoThree() {
		
		a=10;
		b=100;//we can initialize static variables also
		
		System.out.println(a+"-------"+b);
		
	}
	
	public ConsDemoThree(int k) {
		
		a=250;
		b=500;//we can initialize static variables also
		
		System.out.println(a+"-------"+b);
		
	}
	
	public ConsDemoThree(int k,int l) {
				
		System.out.println(a+"-------"+b);
		
	}
	
	

	public static void main(String[] args) {
		
		ConsDemoThree consDemoThree = new ConsDemoThree();
		ConsDemoThree consDemoThree2 = new ConsDemoThree(5);
		ConsDemoThree consDemoThree3= new ConsDemoThree(2,3);

	}

}
