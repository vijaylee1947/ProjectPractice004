package doWhile_loop;

public class ToPrintProductOf123Number {

	public static void main(String[] args) {
		int num=123;
		int sum=1;
		do {
			int rem=num%10;
			sum=sum*rem;
			num=num/10;
		}while(num!=0);
		System.out.println("product of the digit is:"+sum);
	}

}
