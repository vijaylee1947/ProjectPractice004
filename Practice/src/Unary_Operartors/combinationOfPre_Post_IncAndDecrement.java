package Unary_Operartors;

public class combinationOfPre_Post_IncAndDecrement {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=++a + --b + a-- + b++;
		System.out.println(a);//10
		System.out.println(b);//5
		System.out.println(c);//30
	}

}
