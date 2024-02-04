package Ternary_Operartors;

public class FindMaxNumber_Among3Numbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=15;
		int res=(a>b)?((a>c)?a:b):((b>c)?b:c);
		System.out.println(res);
	}

}
