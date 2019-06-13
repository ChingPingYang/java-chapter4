
public class Define {
	
	public static int max(int num1, int num2) {
		int result;
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		return result;
	}
	
	public static double max(double num1, double num2) {
		double result;
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		return result;
	}
	
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}
	
	
	
	
}
