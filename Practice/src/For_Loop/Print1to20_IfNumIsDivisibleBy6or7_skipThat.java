package For_Loop;

public class Print1to20_IfNumIsDivisibleBy6or7_skipThat {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i%6==0||i%7==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
