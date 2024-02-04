package StaticInitializer;

public class Browser {

	static void search(String url) {
		System.out.println(url+" "+"webpage is opened");
	}
	public static void main(String[] args) {
		System.out.println("Browser Launched");
	}
	static {
		search("http://www.google.com");
	}

}
