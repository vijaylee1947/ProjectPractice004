package StaticInitializer;

public class Assignment3 {

	static int a=test();
	static int b=20;
	public static int test() {
		System.out.println("a from test()"+a);
		System.out.println("b from test()"+b);
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("main start");
		test();
		System.out.println("main end");
	}
	static {
		System.out.println(b);
		b=40;
	}

}
