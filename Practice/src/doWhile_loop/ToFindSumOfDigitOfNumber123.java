package doWhile_loop;

public class ToFindSumOfDigitOfNumber123 {

	public static void main(String[] args) {
		int num=123;
		int sum=0;
		do {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}while(num!=0);
		System.out.println("sum of the digit of the number is:"+sum);
	}

}
