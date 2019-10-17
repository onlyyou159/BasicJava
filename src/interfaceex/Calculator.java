package interfaceex;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int um2) {
		return num1 + um2;
		
	}

	@Override
	public int substract(int num1, int um2) {
		
		return num1 - um2;
	}


}
