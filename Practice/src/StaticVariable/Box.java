package StaticVariable;

public class Box {

	public static void displayname() {
		System.out.println("from Box"+" "+Person.name);
	}
	public static void main(String[] args) {
		displayname();
	}
}
