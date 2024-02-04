package StaticMethod;

public class Example1 {

	public static void demo()
	{
		System.out.println("from demo");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		demo();
		Example1.demo();
		System.out.println("main end");
	}

}
