package Ternary_Operartors;

public class FindMinNumber_Among3Numbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=15;
		int ans=(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println(ans);
	}

}
