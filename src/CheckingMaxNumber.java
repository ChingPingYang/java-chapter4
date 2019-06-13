import java.util.Scanner;
public class CheckingMaxNumber {

	public static void main(String[] args) {
		System.out.println("Put three random integer numbers: ");
		
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		
		Define maxGet = new Define();
		double maxNum = maxGet.max(num1, num2, num3);
		System.out.println("The maximum number is " + maxNum + ".");
				
		
		
		
	}

}
