package ex;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		
		Scanner apple1 = new Scanner (System.in);
		System.out.println("ù��° �� �� �Է��ϼ��� : ");
		int act1 = apple1.nextInt();
		
		Scanner apple2 = new Scanner (System.in);
		System.out.println("�ι�° �� �� �Է��ϼ��� : ");
		int act2 = apple2.nextInt();
		
		Scanner apple3 = new Scanner (System.in);
		System.out.println("������ �� �Է��ϼ��� :  ");
		 String act3 = apple3.next();
		
		 switch(act3) {
		 case "+": 
			 System.out.println(add(act1,act2));
			 break;
		 case "-":
			 System.out.println(subtract(act1,act2));
			 break;
		 case "*":
			 System.out.println(multiply(act1,act2));
			 break;
		 case "/":
			 System.out.println(divide(act1,act2));
			 break;	 
			 
		 }
		
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


