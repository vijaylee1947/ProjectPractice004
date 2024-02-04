package Arrays;
import java.util.Scanner;
public class DynamicInitializationOfArray_GettingDataFromUser {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the arraysize");
		int[] a=new int[s.nextInt()] ;
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("lenth of the array is:"+a.length);
		//to acess all the lements
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
