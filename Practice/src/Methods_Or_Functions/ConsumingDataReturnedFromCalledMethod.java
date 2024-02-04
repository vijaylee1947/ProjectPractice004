package Methods_Or_Functions;

public class ConsumingDataReturnedFromCalledMethod {

	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int res=add(5,5);//storing returned data in variable res to Consume
		System.out.println(res);
		System.out.println(add(8,8));//without storing data,directly printing data as expression
		int c=30;
		System.out.println(res=add(5,5)-3);
	}

}
