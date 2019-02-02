package com.corejava.variablesDemo;

public class StaticVariables {
	
	static int a=1520;
	static int b=5980;
	
	static void M1()
	{
		
		System.out.println(a);//direct access
		System.out.println(b);
		System.out.println(StaticVariables.a);//using class
		System.out.println(StaticVariables.b);
	}
	
	
	void M2()
	{
		
		System.out.println(a);//direct access
		System.out.println(b);
		System.out.println(StaticVariables.a);//using class
		System.out.println(StaticVariables.b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M1();
		new StaticVariables().M2();
		//StaticVariables st= new StaticVariables();
		//st.a;
	}

}
