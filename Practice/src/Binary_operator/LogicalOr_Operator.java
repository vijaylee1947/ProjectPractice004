package Binary_operator;

public class LogicalOr_Operator {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println(a<=b || b>=a);//true
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b || ++b<=a);//false
		System.out.println(a);
		System.out.println(b);
		System.out.println(++b<a || ++a==b);//true
		System.out.println(a);
		System.out.println(b);
	}

}
