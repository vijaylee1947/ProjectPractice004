package PlayingWithObjects;

public class ToPassObjectReferenceToAMethod {

	

}
class box{
	
}
class bottle{
	
}
class example1{
	public static void displayref(box obj_ref) {
		System.out.println(obj_ref);
	}
	public static void displayref(bottle obj_ref) {
		System.out.println(obj_ref);
	}
	public static void main(String[] args) {
		box b1=new box();
		displayref(b1);
		box b2=new box();
		displayref(b2);
	}
}
