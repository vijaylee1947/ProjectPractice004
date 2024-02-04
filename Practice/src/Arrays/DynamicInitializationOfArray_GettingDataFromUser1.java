package Arrays;
import java.util.Scanner;
public class DynamicInitializationOfArray_GettingDataFromUser1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] b=new int[s.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		System.out.println(b.length);
	}
}
