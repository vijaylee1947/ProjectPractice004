package Methods_Or_Functions;

public class Rectangle {

	public int lb(int l,int b) {
		return l*b;
	}
	public static int peri(int l1,int b1) {
		return 2*l1+b1;
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		System.out.println(r.lb(5, 8));
		System.out.println(peri(8,9));
	}

}
