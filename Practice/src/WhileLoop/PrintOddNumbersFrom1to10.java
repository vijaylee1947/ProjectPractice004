package WhileLoop;

public class PrintOddNumbersFrom1to10 {

	public static void main(String[] args) {
		int i=1;//initialization
		while(i<=10) {
			if(i%2==1) {
				System.out.println(i);
			}
			i++;
		}
	}

}
