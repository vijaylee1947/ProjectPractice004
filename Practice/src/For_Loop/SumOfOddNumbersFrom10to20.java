package For_Loop;

public class SumOfOddNumbersFrom10to20 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=10;i<=20;i++) {
			if(i%2==1) {
				sum=sum+i;
			}
			
		}
		System.out.println("sum of the even numbers is:"+sum);
	}

}
