package Constructors;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("vinni");
		Student s3=new Student("nikki",01);
		Student s4=new Student("kemi",02,35);
		System.out.println(s1.name+" "+s1.sid+" "+s1.age);
		System.out.println(s2.name+" "+s2.sid+" "+s2.age);
		System.out.println(s3.name+" "+s3.sid+" "+s3.age);
		System.out.println(s4.name+" "+s4.sid+" "+s4.age);
	}
}
