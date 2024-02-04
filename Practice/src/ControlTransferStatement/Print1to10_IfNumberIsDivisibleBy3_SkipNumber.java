package ControlTransferStatement;

public class Print1to10_IfNumberIsDivisibleBy3_SkipNumber {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i%3==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
