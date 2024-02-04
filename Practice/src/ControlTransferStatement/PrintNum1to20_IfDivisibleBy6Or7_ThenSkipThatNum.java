package ControlTransferStatement;

public class PrintNum1to20_IfDivisibleBy6Or7_ThenSkipThatNum {

	public static void main(String[] args) {
		int i=1;
		while(i<=20) {
			if(i%6==0||i%7==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
