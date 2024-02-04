package Unary_Operartors;

public class UsingPost_Increment1 {
	
	public static void main(String[] args) {
		int a=10;
		int b=a++ + a++;
		System.out.println(b);//21
		System.out.println(a);//12
	}

}
