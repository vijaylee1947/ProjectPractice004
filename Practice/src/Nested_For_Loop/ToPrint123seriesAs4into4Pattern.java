package Nested_For_Loop;

public class ToPrint123seriesAs4into4Pattern {

	public static void main(String[] args) {
		int num=1;
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=5;c++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
