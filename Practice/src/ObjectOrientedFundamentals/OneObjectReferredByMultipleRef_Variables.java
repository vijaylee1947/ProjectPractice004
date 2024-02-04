package ObjectOrientedFundamentals;

public class OneObjectReferredByMultipleRef_Variables {

	
}
class example11{
	public static void main(String[] args) {
		OneObjectReferredByMultipleRef_Variables b1=new OneObjectReferredByMultipleRef_Variables();
		OneObjectReferredByMultipleRef_Variables b2=b1;
		OneObjectReferredByMultipleRef_Variables b3=b2;
		System.out.println(b1==b2);//equality operator used to compare
		System.out.println(b2==b3);
		System.out.println(b3==b1);
	}
}
