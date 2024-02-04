package StaticVariable;
/* program to call one static variable within class , as well as in othe class*/
public class Person {

	static String name="arjun";
	
	public static void display() {
		System.out.println("from display()"+" "+name);
	}
	public static void main(String[] args) {
		display();
		System.out.println("from main"+" "+name);
	}

}
