package Test;

public class Test {

	static int a = 10;
	static int b = 20;
	int c = 1000;
	int d = 800;

	public static void main(String[] args) {
		int a = 5000;
		int b = 6000;

		Test t = new Test();
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test.a);
		System.out.println(Test.b);
		System.out.println(t.c);
		System.out.println(t.d);

		t.M1();
	}

	void M1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
