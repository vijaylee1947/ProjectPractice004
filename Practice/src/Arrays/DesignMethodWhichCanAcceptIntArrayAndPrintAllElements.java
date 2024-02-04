package Arrays;

public class DesignMethodWhichCanAcceptIntArrayAndPrintAllElements {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		demo(a);
		
	}
	public static void demo(int[] a) {
		for(int i=3;i>=0;i--) {
			System.out.println("from demo:"+" "+a[i]);
		}
	}

}
