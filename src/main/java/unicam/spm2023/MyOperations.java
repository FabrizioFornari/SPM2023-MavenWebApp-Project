package unicam.spm2023;

public class MyOperations {
	
	int a;
	int b;
	
	public MyOperations() {
	    a = 0;
	    b = 0;
	  }
	
	public static void main( String[] args )
    {
		
		MyOperations mC = new MyOperations();
     
		mC.a = 5;
		mC.b = 0;
		
		System.out.println(mC.multiply(mC.a,mC.b));
		
		if(mC.b==0) {
			System.out.println("Division by zero");
			return;
		}
		
		System.out.println(mC.divide(mC.a,mC.b));
		
    }
	
	
	public int multiply(int x, int y) {
		return (x*y);
	}
	
	public int divide(int x, int y) {
		return (x/y);
	}
}
