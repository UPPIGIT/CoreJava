package com.corejava.WrapperClassesDemo;

public class WrapperClassDemoOne {
	public static void main(String[] args) {

		Integer I = new Integer(10);
		Integer I1 = new Integer("10");
		Integer I2 = new Integer((int) 10.5); // CE . we need to convert into int
		// Integer I3 = new Integer("10.5");// RE: NumberFormatException
		// Integer I4 = new Integer("ten");
		
		//Float contains 3 cons
		
		Float F = new Float(10.5);
		Float F1 = new Float("10.5");
		Float F2 = new Float(10.5f);
		Float F3 = new Float("10.5");
		Float F4 = new Float(10);
		Float F5 = new Float(10l);
		// byte ,short,int,long Auto widening to float
		
		Character character = new Character('a'); // only one cons
		//Character character2 = new Character("a"); 
		
		// boolean primitive accepts true and false only
		
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean(false);
		//Boolean boolean3 = new Boolean(True);CE
		//Boolean boolean3 = new Boolean(durga);CE
		
		Boolean boolean3 = new Boolean("true");
		Boolean boolean4 = new Boolean("True");
		Boolean boolean5 = new Boolean("TRUE");
		Boolean boolean6 = new Boolean("trUe");
		
		System.out.println(boolean3 +"=="+boolean4+"==="+boolean5+"===="+boolean6);//true==true===true====true
		
		Boolean boolean7 = new Boolean("false");
		Boolean boolean8 = new Boolean("False");
		Boolean boolean9 = new Boolean("FALSE");
		Boolean boolean10 = new Boolean("faLse");
		
		Boolean boolean11 = new Boolean("uppi");
		
		System.out.println(boolean7 +"=="+boolean8+"==="+boolean9+"===="+boolean10+"======"+boolean11);//false==false===false====false======false
		
		
		
		
		

	}
}
