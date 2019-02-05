package com.java.PrivateConsOrSingletonClass;

/*Private constructors are used to restrict the instantiation of a class.
When a class needs to prevent other classes from creating it’s objects 
then private constructors are suitable for that. Objects to the class
 which has only private constructors can be created within the class. 
 A very good use of private constructor is in singleton pattern. 
 This ensures only one instance of a class exist at any point of time.
Here is an example of singleton pattern using private constructor.*/

public class MyClass {
	
	private static MyClass myClass = new MyClass();
	
	private MyClass() {
		
	}
	
	private static MyClass getObj()
	{
		return myClass;
	}
	
	

	public static void main(String[] args) {
	
		MyClass myClass = MyClass.getObj();
		MyClass myClass1 = MyClass.getObj();
		
		System.out.println(myClass.hashCode());
		System.out.println(myClass1.hashCode());
		

	}

}
