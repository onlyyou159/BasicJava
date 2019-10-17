package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int um2 = 5;
		CompleteCalc calc = new CompleteCalc( );
		System.out.println(calc.add(num1, um2));
		System.out.println(calc.substract(num1, um2));
		System.out.println(calc.times(num1, um2));
		System.out.println(calc.divide(num1, um2));
		calc.showInfo();

	}

}
