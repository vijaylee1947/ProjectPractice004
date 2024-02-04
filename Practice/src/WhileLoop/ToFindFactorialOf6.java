package WhileLoop;

public class ToFindFactorialOf6 {

	public static void main(String[] args) {
		int i=6;
		int sum=1;
		while(i>=1) {
			sum=i*sum;
			i--;
		}
		System.out.println("factorial of 6 is:"+sum);
	}

}
