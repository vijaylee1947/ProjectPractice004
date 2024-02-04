package Arrays;

public class FetchingDataFromArray {

	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[0]);
		System.out.println(a.length-1);
		System.out.println(a[3]);
		System.out.println(a[2-1]);//20
		System.out.println(a[3-1]);//30
	}
}
