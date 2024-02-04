package Else_if_ladder;

public class PrintingDaysLieBetwen1to7 {

	public static void main(String[] args) {
		int no=5;
				
		if(no==1) {
			System.out.println("Sunday");
		}else if(no==2) {
			System.out.println("monday");
		}else if(no==3){
			System.out.println("tuesday");
		}else if(no==4) {
			System.out.println("wednesday");
		}else if(no==5) {
			System.out.println("thursday");
		}else if(no==6) {
			System.out.println("friday");
		}else if(no==7) {
			System.out.println("saturday");
		}else {
			System.out.println("not a valid day number");
		}
	}
}
