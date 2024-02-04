package Methods_Or_Functions;

public class UseStaticMembersOf1Class_insideAnotherMemberOfSameClass {

	public static void demo() {
		System.out.println("hello!!!!");
	}
	
	public static void main(String[] args) {
		demo();
		UseStaticMembersOf1Class_insideAnotherMemberOfSameClass.demo();
		
	}
}
