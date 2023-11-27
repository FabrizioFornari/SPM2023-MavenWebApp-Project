package unicam.spm2023;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(hello());

	}

	public static String hello() {
		String hello = "Hello World!\n";		
		hello=hello+System.getProperty("os.name");		
		return hello;
	}
	
	public String printNumber(int n) {
		//System.out.println("n: "+n);
		return("n: "+n);
	}
	
	public String getOS() {
		return System.getProperty("os.name");
	}
	
}