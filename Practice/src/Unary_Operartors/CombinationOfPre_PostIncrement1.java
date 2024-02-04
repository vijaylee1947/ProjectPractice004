package Unary_Operartors;

public class CombinationOfPre_PostIncrement1 {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int c=7;
		int d= ++a + b++ + ++c + a++;
		System.out.println(a);//7
		System.out.println(b);//7
		System.out.println(c);//8
	}
}
