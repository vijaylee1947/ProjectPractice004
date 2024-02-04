package ControlTransferStatement;

public class DisplayingErrorUsingBreak {

	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			System.out.println(i);
			break;
			//i++;//unreachable code error, so always break should be last statement
				//inside the block
		}
		System.out.println("i am inside method");
	}

}
