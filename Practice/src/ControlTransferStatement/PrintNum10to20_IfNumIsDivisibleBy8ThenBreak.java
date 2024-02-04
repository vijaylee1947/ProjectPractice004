package ControlTransferStatement;

public class PrintNum10to20_IfNumIsDivisibleBy8ThenBreak {

	public static void main(String[] args) {
		int i=10;
		while(i<=20) {
			if(i%8==0) {
				break;
			}else {
				System.out.println(i);
				i++;
			}
		}
	}

}
