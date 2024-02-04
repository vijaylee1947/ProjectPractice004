package Variables;

public class CallingStaticVariableUsingObjecrReference {
	
	static int a=10;
	int b=20;
	int c=30;
	
	public static void main(String[] args) {
		
		CallingStaticVariableUsingObjecrReference v1=new CallingStaticVariableUsingObjecrReference();
		System.out.println(a);//10
		System.out.println(CallingStaticVariableUsingObjecrReference.a);//10
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println(v1.c);
		a=40;
		CallingStaticVariableUsingObjecrReference v2=new CallingStaticVariableUsingObjecrReference();
		System.out.println(v2.a);
		System.out.println(v2.b);
		System.out.println(v2.c);
	}

}
