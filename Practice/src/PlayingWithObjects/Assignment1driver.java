package PlayingWithObjects;

public class Assignment1driver {

	public static void main(String[] args) {
		Assignment1 a1=new Assignment1();
		Assignment1 a2=new Assignment1();
		Assignment1 a3=new Assignment1();
		Assignment1 a4=new Assignment1();
		Assignment1 a5=new Assignment1();
		a1=a2;
		a2=a3;
		a3=a4;
		a4=a5;
		a1.name="vijay";
		a1.id=9;
		a1.phone="9887653454";
		System.out.println(a3.name);
		System.out.println(a3.id);
		System.out.println(a3.phone);
		a4.name="peer";
		a4.id=5;
		a4.phone="7869874553";
		System.out.println(a5.name);
		System.out.println(a5.id);
		System.out.println(a5.phone);
	}

}
