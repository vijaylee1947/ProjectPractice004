package Methods_Or_Functions;

public class CreatingAndCallingNon_StaticMethodwithinSameClass {

	public void demo() {
		System.out.println("from demo()");
	}
	public static void main(String[] args) {
		
		CreatingAndCallingNon_StaticMethodwithinSameClass a=new CreatingAndCallingNon_StaticMethodwithinSameClass();
		a.demo();
	}

}
