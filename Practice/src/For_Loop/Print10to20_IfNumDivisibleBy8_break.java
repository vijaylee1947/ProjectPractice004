package For_Loop;

public class Print10to20_IfNumDivisibleBy8_break {

	public static void main(String[] args) {
		for(int i=10;i<=20;i++) {
			if(i%8==0) {
				break;
			}
			System.out.println(i);
		}
	}

}
