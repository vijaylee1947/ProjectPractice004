package Arrays;

public class StoringElementsOrValuesInsideArray {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=10+20;
		int b=30;
		a[2]=b;
		a[3]=b+a[1];
		a[4]=50;
		System.out.println(a.length);
		System.out.println(a);
	}

}
