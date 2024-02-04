package Methods_Or_Functions;

public class MethodGetExecutedOnlyWhenItIsCalled_Example {

	public static void main(String[] args) {
		
		System.out.println("main start");
		demo();//method call statement
		System.out.println("main end");
	}
	//create a new method
	public static void demo() {
		System.out.println("hello....!");
	}

}
