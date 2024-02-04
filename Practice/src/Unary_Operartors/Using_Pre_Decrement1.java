package Unary_Operartors;

public class Using_Pre_Decrement1 {

	public static void main(String[] args) {
		int a=10;
		int b=11;
		int c=--a + --b;
		System.out.println(a);//9
		System.out.println(b);//10
		System.out.println(c);//19
	}
}
