package JavaPrograms;

public class UsingPlusOperator {
	
	public static void main(String[] args) {
		
		System.out.println(1+2);//3
		System.out.println(1+'A');//1+65=66
		System.out.println(2+'a');//2+97=99
		System.out.println(1+"hello");//1hello
		System.out.println(1+"2"+3);//123
		System.out.println("1"+4+3);//143
		System.out.println(1+2+"3");//33
		System.out.println('a'+1+"a");//97+1+"a"=98a
	}
}
