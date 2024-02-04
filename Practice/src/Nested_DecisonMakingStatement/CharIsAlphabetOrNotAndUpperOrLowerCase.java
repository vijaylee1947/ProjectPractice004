package Nested_DecisonMakingStatement;

public class CharIsAlphabetOrNotAndUpperOrLowerCase {

	public static void main(String[] args) {
		char ch='1';
		if((ch>='A')&&(ch<='B')||(ch>='a')&&(ch<='z')){
			if(ch>='A' && ch<='Z'){
				System.out.println("it is an uppercase letter");
			}else {
				System.out.println("it is an lowercase letter");
			}
		}else {
		System.out.println("it is not an character");
	}

}
}
