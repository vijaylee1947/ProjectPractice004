package Variables;

public class NonStaticVariable {
	
	int a=10;
	
	public static void main(String[] args) {
		
		NonStaticVariable v=new NonStaticVariable();
		System.out.println(v.a);//10
		v.a=20;
		System.out.println(v.a);//20
		
	}

}
