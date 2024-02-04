package Variables;

public class CreatingMultipleObjectsToCallSameNonStaticMember {
	
	int a=10;
	int b=20;
	public static void main(String[] args) {
		
		CreatingMultipleObjectsToCallSameNonStaticMember v=new CreatingMultipleObjectsToCallSameNonStaticMember();
		System.out.println(v.a);
		System.out.println(v.b);
		v.a=30;
		v.b=40;
		CreatingMultipleObjectsToCallSameNonStaticMember v1=new CreatingMultipleObjectsToCallSameNonStaticMember();
		System.err.println(v);
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v1);
		System.out.println(v1.a);
		System.out.println(v1.b);
	}

}
