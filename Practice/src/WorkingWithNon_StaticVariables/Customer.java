package WorkingWithNon_StaticVariables;

public class Customer {

	int cid;
	String pswd;
	String name;
	
}
class customerTest{
	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		//initializing
		c1.cid=1;
		c1.name="james";
		c1.pswd="abc143";
		c2.cid=2;
		c2.name="randy";
		c2.pswd="56dc52";
		c3.cid=3;
		c3.name="romia";
		c3.pswd="1f4g5h";
		System.out.println(c1.cid);
		System.out.println(c1.name);
		System.out.println(c1.pswd);
		System.out.println(c2.cid);
		System.out.println(c2.name);
		System.out.println(c2.pswd);
		System.out.println(c3.cid);
		System.out.println(c3.name);
		System.out.println(c3.pswd);
	}
}
