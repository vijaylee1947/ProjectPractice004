package StaticInitializer;

public class Example2 {

	static {
		System.out.println("from SIB-01");
	}//end of static block
	public static void main(String[] args) {
		System.out.println("from main");
	}// end of main
	static {
		System.out.println("from SIB-02");
	}

}
