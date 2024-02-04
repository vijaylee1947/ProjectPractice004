package Unary_Operartors;

public class UsingPreIncrement3 {
	
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=++a + ++b;
		int d=++c + ++a + ++b;
		System.out.println(a);//12
		System.out.println(b);//7
		System.out.println(c);//18
	}

}
