package chapter2;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum +"�Դϴ�.");
		
		int sum01 = subtract(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sum01 +"�Դϴ�.");
		
		int sum02 = multiply(num1, num2);
		System.out.println(num1 + " x " + num2 + " = " + sum02 +"�Դϴ�.");
		
		int sum03 = divide(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + sum03 +"�Դϴ�.");
	}
		public static int add(int n1, int n2) {
			int result = n1 + n2;
			return result;
	}
	
		public static int subtract(int n1, int n2) {
			int result = n1 - n2;
			return result;
	}
		public static int multiply(int n1, int n2) {
			int result = n1 * n2;
			return result;
	}
		public static int divide(int n1, int n2) {
			int result = n1 / n2;
			return result;
	}
}
