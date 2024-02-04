package For_Loop;

public class print1to10_IfNumIsDivisibleBy3_skip {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
