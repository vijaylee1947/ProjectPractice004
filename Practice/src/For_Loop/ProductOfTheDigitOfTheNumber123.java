package For_Loop;

public class ProductOfTheDigitOfTheNumber123 {

	public static void main(String[] args) {
		int num=123;
		int sum=1;
		for(int i=num;i!=0;i=i/10) {
			int rem=i%10;
			sum=sum*rem;
		}
		System.out.println("product of the digit is:"+sum);
	}
}
