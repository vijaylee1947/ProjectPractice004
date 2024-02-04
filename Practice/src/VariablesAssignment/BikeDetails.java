package VariablesAssignment;

public class BikeDetails {
	String bname;
	String cc;
	String brand;
	String color;
	public static void main(String[] args) {
		
		BikeDetails b1=new BikeDetails();
		b1.bname="NinjaHunt";
		b1.brand="kawasaki";
		b1.cc="1000cc";
		b1.color="yellowwhite";
		System.out.println("bname:"+b1.bname+" "+"brand:"+b1.brand+" "+"cc:"+b1.cc+"color:"+b1.color);
	
		BikeDetails b2=new BikeDetails();
		b2.bname="Horse";
		b2.brand="BMW";
		b2.cc="2000cc";
		b2.color="black";
		System.out.println("bname:"+b2.bname+" "+"brand:"+b2.brand+" "+"cc:"+b2.cc+"color:"+b2.color);
	
		BikeDetails b3=new BikeDetails();
		b3.bname="Karishma";
		b3.brand="Honda";
		b3.cc="3000cc";
		b3.color="red";
		System.out.println("bname:"+b3.bname+" "+"brand:"+b3.brand+" "+"cc:"+b3.cc+"color:"+b3.color);
	}
	

}
