package Unary_Operartors;

public class UsingPreIncrement2 {
	
	public static void main(String[] args) {
		int a=10;
		int b=11;
		int c= ++a + ++b;
		int d=++c;//24
		System.out.println(d);
	}

}
