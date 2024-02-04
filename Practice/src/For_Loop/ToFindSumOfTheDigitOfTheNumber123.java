package For_Loop;

public class ToFindSumOfTheDigitOfTheNumber123 {

	public static void main(String[] args) {
		int num=123;
		int sum=0;
		for(int i=num;i!=0;i=i/10) {
			int rem=i%10;
			sum=sum+rem;
		}
		System.out.println("sum of the digit of the number is:"+sum);
	}
}
