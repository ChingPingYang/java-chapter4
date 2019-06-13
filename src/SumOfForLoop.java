import java.util.Scanner;
public class SumOfForLoop {

	public static void main(String[] args) {
		
		System.out.println("put two number for a1 and a2");
		Scanner input = new Scanner(System.in);
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		
		
		Sum sum = new Sum();
		int finalResult = sum.sum(a1, a2);
		
		System.out.println(finalResult);
		

	}

}
