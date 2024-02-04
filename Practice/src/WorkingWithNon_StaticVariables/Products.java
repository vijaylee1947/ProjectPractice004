package WorkingWithNon_StaticVariables;

public class Products {

	int pid;
	String name;
	double price;
}
class Productstest{
	public static void main(String[] args) {
		Products p1=new Products();
		p1.pid=01;
		p1.name="iphone";
		p1.price=25000;
		System.out.println(p1.name);
		System.out.println(p1.pid);
		System.out.println(p1.price);
	}
}
