package StaticVariable;

public class AccessingStaticVariableWithInTheClass {

	static String schoolname="childtree";
	int sid;
	static void display() {
		System.out.println(schoolname);
	}
	
	AccessingStaticVariableWithInTheClass(int sid){
		this.sid=sid;
	}
	public static void main(String[] args) {
		System.out.println(schoolname);
		System.out.println(AccessingStaticVariableWithInTheClass.schoolname);
		display();
	}
}
