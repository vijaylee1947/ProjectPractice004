package ObjectOrientedFundamentals;

public class ComparingReferenceOfSameclassObjects {

	
}
class example10{
	public static void main(String[] args) {
		ComparingReferenceOfSameclassObjects c1=new ComparingReferenceOfSameclassObjects();
		ComparingReferenceOfSameclassObjects c2=new ComparingReferenceOfSameclassObjects();
		ComparingReferenceOfSameclassObjects c3=new ComparingReferenceOfSameclassObjects();
		System.out.println(c1+" "+c2+" "+c3);
		System.out.println(c1==c2);//equality operator use to compare
		System.out.println(c2==c3);
		System.out.println(c3==c1);
	}
}
