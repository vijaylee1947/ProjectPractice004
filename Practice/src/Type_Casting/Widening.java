package Type_Casting;

public class Widening {

	public static void main(String[] args) {
		
		byte b=0;
		int  i=b;//widening
		System.out.println(i);//0
		
		int s=8;
		double d=s;//widening
		System.out.println(d);//8
		
		char c='A';
		int x=c;//widening
		System.out.println(x);//65
		
		short s1=16;
		long l=s1;//widening
		System.out.println(l);//16
		
		long l1=10;
		float f=l1;//widening
		System.out.println(f);//10
	}

}
