package StaticInitializer;

public class Example1 {

	static {
		System.out.println(" from SIB-01");
	}// first static block gets executed
	public static void main(String[] args) {
		System.out.println("from main");
	}

}
