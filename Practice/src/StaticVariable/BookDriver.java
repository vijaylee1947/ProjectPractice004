package StaticVariable;

public class BookDriver {

	public static void main(String[] args) {
		Book b1=new Book("jamesbond");
		Book b2=new Book("Simba");
		b1.title="jimmy";
		b1.count=1;
		System.out.println("count:"+b1.count+" "+"Title:"+b1.title);
		System.out.println("count:"+b2.count+" "+"Title:"+b2.title);
		
	}

}
