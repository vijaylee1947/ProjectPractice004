package Methods_Or_Functions;

public class Circle {

	public double radius(double r) {
		double area=22/7*r*r;
		return area;
	}
	public static void main(String[] args) {
		Circle a=new Circle();
		System.out.println(a.radius(20));
	}

}
