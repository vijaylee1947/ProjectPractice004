package Nested_For_Loop;

public class ToPrintABCDas4into4Pattern {

	public static void main(String[] args) {
		for(char r='A';r<='D';r++) {
			for(char c='A';c<='D';c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
