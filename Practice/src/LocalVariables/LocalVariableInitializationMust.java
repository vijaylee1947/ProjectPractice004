package LocalVariables;

public class LocalVariableInitializationMust {
	
	static double a;
	
	public static void main(String[] args) {
		
		int b;
		
		System.out.println(a);//0.0
		//System.out.println(b);//error
		b=30;
		System.out.println(b);
	}

}
