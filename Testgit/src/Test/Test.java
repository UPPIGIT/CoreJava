package Test;

public class Test {
	
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		
		Test t = new Test();
		t.M1();
	}
	
	void M1()
	{
		System.out.println(a);
		System.out.println(b);
	}

}
