package doWhile_loop;

public class ToPrint1to10IfNumberIsDivisibleBy8_Break {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i%8==0) {
				break;
			}
			System.out.println(i);
			i++;
		}while(i<=10);
	}

}
