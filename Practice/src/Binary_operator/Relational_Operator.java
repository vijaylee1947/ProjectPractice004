package Binary_operator;

public class Relational_Operator {

	public static void main(String[] args) {
		int a=10;
		int b=11;
		System.out.println(b>a);//true
		System.out.println(a<b);//true
		System.out.println(b>=a);//true
		System.out.println(a<=b);//true
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		System.out.println(b==++a);//true
		System.out.println(a++>b);//false
		System.out.println(a<=++b);//true
		System.out.println(++a!=b);//true
	}

}
