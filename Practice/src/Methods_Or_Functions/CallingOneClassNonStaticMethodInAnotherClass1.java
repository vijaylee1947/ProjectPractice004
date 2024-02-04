package Methods_Or_Functions;

public class CallingOneClassNonStaticMethodInAnotherClass1 {

	public static void main(String[] args) {
		CallingOneClassNonStaticMethodInAnotherClass c=new CallingOneClassNonStaticMethodInAnotherClass();
		System.out.println(c.add(7,7));
		System.out.println(c.sub(50,10));
	}

}
