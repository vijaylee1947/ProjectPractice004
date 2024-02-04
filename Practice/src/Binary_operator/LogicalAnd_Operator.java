package Binary_operator;

public class LogicalAnd_Operator {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println(++a==b && b>=a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a==b && a<=++b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==++b && ++b<=a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b++==++a && b>=++a);
		System.out.println(a);
		System.out.println(b);
	}

}
