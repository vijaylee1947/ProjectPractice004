package Variables;

public class VariablesWithDefaultValues {
	
	static int a;
	double b;
	String s;
	char c;
	boolean b1;
	public static void main(String[] args) {
		
		System.out.println(a);//0
		VariablesWithDefaultValues v1=new VariablesWithDefaultValues();
		System.out.println(v1.b);//0.0
		System.out.println(v1.s);//Null
		System.out.println(v1.c);//undefined
		System.out.println(v1.b1);//false
		a=10;
		v1.b=500;
		v1.s="Rita";
		v1.c='A';
		v1.b1=true;
		System.out.println("--------------------------------");
		System.out.println(a);//10
		System.out.println(v1.b);//500.0
		System.out.println(v1.s);//Ruta
		System.out.println(v1.c);//A
		System.out.println(v1.b1);//true
	}

}
