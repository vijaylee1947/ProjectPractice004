package WorkingWithNon_StaticVariables;

public class Shipper {

	int sid;
	String Aname;
	double cost;
}
class Shippertest{
	public static void main(String[] args) {
		Shipper s1=new Shipper();
		Shipper s2=new Shipper();
		Shipper s3=new Shipper();
		s1.sid=101;
		s1.Aname="addy";
		s1.cost=5000;
		s2.sid=102;
		s2.Aname="maggi";
		s2.cost=4000;
		s3.sid=103;
		s3.Aname="keeri";
		s3.cost=1000;
		System.out.println(s1.sid);
		System.out.println(s1.Aname);
		System.out.println(s1.cost);
		System.out.println(s2.sid);
		System.out.println(s2.Aname);
		System.out.println(s2.cost);
		System.out.println(s3.sid);
		System.out.println(s3.Aname);
		System.out.println(s3.cost);
	}
}
