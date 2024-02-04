package If_else_Statement;

public class GivenCharIsAlohabetOrNot {

	public static void main(String[] args) {
		char ch='A';
		if((ch>='A')&&(ch<='Z')||(ch>='a')&&(ch<='z')) {
			System.out.println("it is an character");
		}else {
			System.out.println("it is not an acharacter");
		}
	}
}
