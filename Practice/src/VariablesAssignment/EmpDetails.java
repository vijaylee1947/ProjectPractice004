package VariablesAssignment;

public class EmpDetails {
	String empname;
	int eid;
	double salary;
	static String companyname="TYSS";
	public static void main(String[] args) {
		
		EmpDetails e=new EmpDetails();
		e.empname="reema";
		e.eid=9;
		e.salary=10000;
		System.out.println("empname:"+e.empname+" "+"eid:"+e.eid+" "+"esalary:"+e.salary+" "+e.companyname);
		
		EmpDetails e1=new EmpDetails();
		e1.empname="ram";
		e1.eid=1;
		e1.salary=20000;
		System.out.println("empname:"+e1.empname+" "+"eid:"+e1.eid+" "+"esalary:"+e1.salary+" "+e1.companyname);

		EmpDetails e2=new EmpDetails();
		e2.empname="nisha";
		e2.eid=4;
		e2.salary=50000;
		System.out.println("empname:"+e2.empname+" "+"eid:"+e2.eid+" "+"esalary:"+e2.salary+" "+e2.companyname);
	}

}
