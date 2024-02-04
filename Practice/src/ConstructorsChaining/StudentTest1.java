package ConstructorsChaining;

public class StudentTest1 {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1("vijay");
		Student1 s3=new Student1("vijay",01);
		Student1 s4=new Student1("vijay",02,25);
		System.out.println(s1.name+" "+s1.sid+" "+s1.age);
		System.out.println(s2.name+" "+s2.sid+" "+s2.age);
		System.out.println(s3.name+" "+s3.sid+" "+s3.age);
		System.out.println(s4.name+" "+s4.sid+" "+s4.age);
		
	}

}
