package Variables;

public class UsingMultiple_NonStaticVariable {
	
	int a=10;
	int b=20;
	
	public static void main(String[] args) {
		
		UsingMultiple_NonStaticVariable v1=new UsingMultiple_NonStaticVariable();
		System.out.println(v1.a);
		System.out.println(v1.b);
		v1.a=30;
		v1.b=40;
		System.out.println(v1.a);
		System.out.println(v1.b);
	}

}
