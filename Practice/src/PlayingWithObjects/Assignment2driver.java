package PlayingWithObjects;

public class Assignment2driver {

	public static void main(String[] args) {
		Assignment2 s1= new Assignment2();
		Assignment2 s2= new Assignment2();
		Assignment2 s3= new Assignment2();
		Assignment2 s4= new Assignment2();
		Assignment2 s5= new Assignment2();
		s1=s2;
		s2=s3;
		s3=s4;
		s4=s5;
		s1.color="red";
		s1.lifespan="10years";
		System.out.println(s3.color);
		System.out.println(s3.lifespan);
		s4.color="green";
		s4.lifespan="100years";
		System.out.println(s5.color);
		System.out.println(s5.lifespan);
		
	}

}
