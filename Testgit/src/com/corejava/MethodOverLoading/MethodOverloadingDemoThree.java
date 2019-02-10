package com.corejava.MethodOverLoading;

/*Note : 
 * while resolving overloaded methods compiler will precedence to child class type arg
 *  when compared with parent type arg 
 * */
class Account
{
}
public class MethodOverloadingDemoThree {

	public void methodOne(Object obj) {
		System.out.println("Object version");
	}

	public void methodOne(String string) {
		System.out.println("String version");
	}
	
/*	public void methodOne(StringBuffer sb) {
		System.out.println("String buffer verion");
	}*/
	
	public static void main(String[] args) {
		
		MethodOverloadingDemoThree demoThree = new MethodOverloadingDemoThree();
		
		demoThree.methodOne("durga");
		demoThree.methodOne(new Object());
		demoThree.methodOne(null);//if we remove 20-23 comments CE: ambiguous
		demoThree.methodOne(new Account());
		demoThree.methodOne(new StringBuffer("uppi"));//string and string buffer both child typd so matched to Object arg method
	}

}
