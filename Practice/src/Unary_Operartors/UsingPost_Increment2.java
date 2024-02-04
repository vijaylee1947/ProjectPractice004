package Unary_Operartors;

public class UsingPost_Increment2 {
	public static void main(String[] args) {
		int a=10;
		int b=11;
		int c=a++ + a++ + b++;
		System.out.println(a);//12
		System.out.println(b);//12
		System.out.println(c);//32
	}

}
