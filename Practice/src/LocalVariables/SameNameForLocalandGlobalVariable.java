package LocalVariables;

public class SameNameForLocalandGlobalVariable {
	int a=10;
	
	public static void main(String[] args) {
		int a=20;
		System.out.println(a);//20
		
		SameNameForLocalandGlobalVariable s=new SameNameForLocalandGlobalVariable();
		System.out.println(s.a);//10
		a=30;
		System.out.println(s.a);
		System.out.println(a);
		
		}

}
