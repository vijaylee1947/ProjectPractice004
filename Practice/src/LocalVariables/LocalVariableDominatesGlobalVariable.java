package LocalVariables;

public class LocalVariableDominatesGlobalVariable {
	
	static int a=10;
	
	public static void main(String[] args) {
		System.out.println(a);//10
		int a=20;
		System.out.println(a);//20
		LocalVariableDominatesGlobalVariable l1=new LocalVariableDominatesGlobalVariable();
		System.out.println(l1.a);//10
		
	}

}
