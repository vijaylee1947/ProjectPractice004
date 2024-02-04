package Variables;

public class Re_InitializingStaticVariable {
	
	static int a=10;
	
	public static void main(String[] args) {
		
		System.out.println(a);//10
		a=20;
		System.out.println(a);//20
	}

}
