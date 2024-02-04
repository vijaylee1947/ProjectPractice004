package PrivateKeyword;

public class PrivateKeywordWithMethos {

	private double price;
	
	//getters and setters
	
	public double getter() {
		return price;
	}
	public void setter(double price) {
		if(price>0) {
			this.price=price;
		}
	}
	
	public static void main(String[] args) {
		PrivateKeywordWithMethos p=new PrivateKeywordWithMethos();
		p.setter(2000);
		System.out.println(p.getter());
		p.setter(-2000);
		System.out.println(p.getter());
	}

}
