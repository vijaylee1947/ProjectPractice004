package Variables;

public class MultipleStaticVariable {
	
	static int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		
		System.out.println(a);//10
		System.out.println(b);//20
		a=30;
		b=40;
		System.out.println(a);//30
		System.out.println(b);//40
	}

}
