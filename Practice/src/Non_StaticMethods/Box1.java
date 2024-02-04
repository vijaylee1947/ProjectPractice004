package Non_StaticMethods;

public class Box1 {

	double length;
	double width;
	
	
	Box1(double length,double width){
		this.length=length;
		this.width=width;
	}
	double getarea() {
		return length*width; 
	}

}
