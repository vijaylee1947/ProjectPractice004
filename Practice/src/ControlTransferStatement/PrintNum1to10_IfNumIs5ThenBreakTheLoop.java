package ControlTransferStatement;

public class PrintNum1to10_IfNumIs5ThenBreakTheLoop {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==5) {
				break;
			}else {
				System.out.println(i);
				i++;
			}
		}
	}

}
