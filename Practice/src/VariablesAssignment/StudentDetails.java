package VariablesAssignment;

public class StudentDetails {
	String sname;
	int sid;
	String Class;
	static String Schoolname="janapada";
	public static void main(String[] args) {
		
		StudentDetails s1=new StudentDetails();
		s1.sname="allen";
		s1.sid=1;
		s1.Class="10th";
		System.out.println("sname:"+s1.sname+" "+"sid:"+s1.sid+" "+"Class:"+s1.Class+" "+"schoolname:"+s1.Schoolname);
	
		StudentDetails s2=new StudentDetails();
		s2.sname="Rita";
		s2.sid=3;
		s2.Class="10th";
		System.out.println("sname:"+s2.sname+" "+"sid:"+s2.sid+" "+"Class:"+s2.Class+" "+"schoolname:"+s2.Schoolname);
	
		StudentDetails s3=new StudentDetails();
		s3.sname="Alex";
		s3.sid=5;
		s3.Class="10th";
		System.out.println("sname:"+s3.sname+" "+"sid:"+s3.sid+" "+"Class:"+s3.Class+" "+"schoolname:"+s3.Schoolname);
	}

}
