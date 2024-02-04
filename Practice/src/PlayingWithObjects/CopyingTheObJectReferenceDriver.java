package PlayingWithObjects;

public class CopyingTheObJectReferenceDriver {

	public static void main(String[] args) {
		CopyingTheObJectReference f=new CopyingTheObJectReference("mango");
		System.out.println(f);//adress
		System.out.println(f.name);
		CopyingTheObJectReference f1=new CopyingTheObJectReference("mango");
		System.out.println(f1);//adress
		System.out.println(f1.name);
		CopyingTheObJectReference f2=new CopyingTheObJectReference("mango");
		f2=f1;
		System.out.println(f2.name);
		CopyingTheObJectReference f3=new CopyingTheObJectReference("mango");
		f3=f2;
		System.out.println(f3.name);
		System.out.println(f2==f3);
	}
	
	
}
