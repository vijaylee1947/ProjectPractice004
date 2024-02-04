package StaticInitializer;

public class Example3 {

	static int i;
	static {
		i=test();
	}
	public static int test() {
		System.out.println("from test:"+i);
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("i:"+i);
	}

}
