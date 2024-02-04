package Unary_Operartors;

public class combinationOfPre_Post_IncAndDecrement1 {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c=4;
		int d=++a + a-- + ++c + --b + b++;
		int e= c++ + --d;
		System.out.println(a);//2
		System.out.println(b);//3
		System.out.println(c);//6
		System.out.println(d);//14
	}
}
