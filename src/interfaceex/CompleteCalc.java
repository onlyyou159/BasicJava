package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int um2) {
		
		return num1 * um2;
	}

	@Override
	public int divide(int num1, int um2) {
		if(um2 !=0)
		return num1/um2;
		else
			return Calc.ERROR;
	}
	public void showInfo( ) {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

}
