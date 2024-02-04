package Type_Casting;

public class Narrowing {

	public static void main(String[] args) {
		
		int i=10;
		byte b=(byte)i;//narrowing
		System.out.println(b);//10
		
		float f=35;
		short s=(short)f;//narrowing
		System.out.println(s);//35
		
		double d=50;
		int i1=(int)d;//narrowing
		System.out.println(i1);//50
		
		long l=65;
		char c=(char)l;//narrowing
		System.out.println(c);//65 or 'A'
	}
}
