package WhileLoop;

public class ToFindSumOfOddNumberFrom10to20 {

	public static void main(String[] args) {
		int i=10;
		int sum=0;
		while(i<=20) {
			if(i%2==1) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
