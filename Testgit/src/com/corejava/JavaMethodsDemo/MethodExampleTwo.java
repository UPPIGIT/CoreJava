package com.corejava.JavaMethodsDemo;


class Account
{
}

class Emp
{
}
public class MethodExampleTwo {
	
	//Method with class type paramaetrs
	
	void M1(Account acc, Emp emp)
	{
		
		System.out.println("Method with class type params");
	}

	Account M2()
	{
		System.out.println("method with class type returntype ");
		return new Account();
	}
	public static void main(String[] args) {
		
		MethodExampleTwo obj = new MethodExampleTwo();
		obj.M1(new Account(), new Emp());
		Account acc=obj.M2();
		System.out.println(acc);

	}

}
