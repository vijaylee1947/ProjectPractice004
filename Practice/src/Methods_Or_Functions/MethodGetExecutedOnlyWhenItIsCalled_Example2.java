package Methods_Or_Functions;

public class MethodGetExecutedOnlyWhenItIsCalled_Example2 {

	public static void main(String[] args) {
		System.out.println("main start");
		test();//method call statement
		System.out.println("main end");
	}
	public static void demo() {
		System.out.println("from demo");
	}
	public static void test() {
		System.out.println("from test");
		demo();
	}
}
