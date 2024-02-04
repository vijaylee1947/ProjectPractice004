package doWhile_loop;

public class ToPrint1to10_IfNumberIs5_BreakTheLoop {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i==5) {
				break;
			}
			System.out.println(i);
			i++;
		}while(i<=10);
	}

}
