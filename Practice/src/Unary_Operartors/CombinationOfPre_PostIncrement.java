package Unary_Operartors;

public class CombinationOfPre_PostIncrement {
	
	public static void main(String[] args) {
		int a=10;
		int b=11;
		int c=++a + a++ + b++ + ++b;
		System.out.println(a);//12
		System.out.println(b);//13
		System.out.println(c);//46
	}

}
