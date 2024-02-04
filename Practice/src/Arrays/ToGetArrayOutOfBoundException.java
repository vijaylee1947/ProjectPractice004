package Arrays;

public class ToGetArrayOutOfBoundException {

	public static void main(String[] args) {
		int[] b=new int[4];
		b[0]=10;
		b[1]=12;
		b[2]=15;
		b[3]=20;
		System.out.println(b[0]);
		System.out.println(b[4]);//Array Out of Bound EXception
		
	}

}
