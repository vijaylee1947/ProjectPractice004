package Nested_DecisonMakingStatement;

public class Alphabet_UpperOrLower_VowelOrconso_DigitOrSchar {

	public static void main(String[] args) {
		char ch='e';
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
			if(ch>='A'&& ch<='Z'){
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					System.out.println("it is an upper case vowel");
			}else {
				System.out.println(" it is an upper case consonent");
		}
			}else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("it is an lower case vowel");
		}else {
			System.out.println("it is an lower case consonent");
		}
	}else if(ch>='1'&&ch<='9') {
		System.out.println("it is an number");
	}else {
		System.out.println("it is an special character");
	}
}
	}

