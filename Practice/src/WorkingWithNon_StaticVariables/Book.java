package WorkingWithNon_StaticVariables;

public class Book {

	String title;
	double price;
}
class BookTest{
	public static void main(String[] args) {
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		//initializing objects
		b1.title="java";
		b1.price=1500;
		b2.title="Titanic";
		b2.price=1000;
		b3.title="Axe";
		b3.price=700;
		//accessing data of the object
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b2.title);
		System.out.println(b2.price);
		System.out.println(b3.title);
		System.out.println(b3.price);
	}
}
