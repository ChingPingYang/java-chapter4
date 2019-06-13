
public class PassByValue {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before. x is " + x);
		increment(x);
		System.out.println("After x is " + x);
		

	}
	
	public static void increment(int n) {
		n++;
		System.out.println("n is " + n);
		
		
	}

}
