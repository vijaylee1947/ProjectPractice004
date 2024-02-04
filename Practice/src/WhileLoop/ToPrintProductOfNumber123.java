package WhileLoop;

public class ToPrintProductOfNumber123 {

	public static void main(String[] args) {
		int num=123;
		int sum=1;
		while(num!=0) {
			int rem=num%10;
			sum=sum*rem;
			num=num/10;
		}
		System.out.println("product of the digit is:"+sum);
	}
	
}
