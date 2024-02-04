package doWhile_loop;

public class ToPrintNumbers1to20_IfNumDivsibleBy6or7_Skip {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i%6==0||i%7==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}while(i<=20);
	}
}
