package Type_Casting;

public class PatternUsingTypeCasting {

	public static void main(String[] args) {
		int k=65;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				char ch=(char)k;
				System.out.print(ch+" ");
				k++;//to get ABCD series
				}
			System.out.println();
		}
	}

}
