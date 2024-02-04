package WorkingWithNon_StaticVariables;

public class Seller {

	int sid;
	String sname;
	double srating;

}
class sellertest{
	public static void main(String[] args) {
		Seller s1=new Seller();
		s1.sid=1;
		s1.sname="arren";
		s1.srating=4.5;
		System.out.println(s1.sname);
		System.out.println(s1.sid);
		System.out.println(s1.srating);
	}
}
