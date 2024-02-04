package doWhile_loop;

public class ToFindSumOfEvenNumbersFrom1to10 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		do {
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}while(i<=10);
		System.out.println("sum of even number is:"+sum);
	}

}
