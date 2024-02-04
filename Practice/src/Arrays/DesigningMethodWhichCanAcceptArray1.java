package Arrays;

public class DesigningMethodWhichCanAcceptArray1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {9,8,7,6};
		demo(a,b);
		
	}
	public static void demo(int[] a,int[] b) {
		System.out.println(a[0]);
		System.out.println(b[b.length-1]);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
