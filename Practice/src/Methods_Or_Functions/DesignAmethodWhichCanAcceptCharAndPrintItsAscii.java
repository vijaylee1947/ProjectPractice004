package Methods_Or_Functions;

public class DesignAmethodWhichCanAcceptCharAndPrintItsAscii {

	public static void getascii(char ch) {
		System.out.println((int)ch);
	}
	public static void main(String[] args) {
		getascii('a');
		getascii('&');
	}

}
