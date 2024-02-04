package ConstructorsChaining;

public class Box {

	double length;
	double width;
	double area;
	
	Box(){
		
	}
	Box(double length){
		this();
		this.length=length;
	}
	Box(double length,double width){
		this(length);
		this.width=width;
	}
	Box(double length,double width,double area){
		this(length,width);
		this.area=area;
	}
}
