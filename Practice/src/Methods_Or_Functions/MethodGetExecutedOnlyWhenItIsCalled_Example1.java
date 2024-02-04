package Methods_Or_Functions;

public class MethodGetExecutedOnlyWhenItIsCalled_Example1 {

	public static void main(String[] args) {
		System.out.println("main start");
		demo();//method call statement
		demo();//method call statement
		System.out.println("main end");
	}
	public static void demo() {
		System.out.println("From demo()");
	}

}
