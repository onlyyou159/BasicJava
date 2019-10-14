package ex;

 import java.util.Scanner;
public class Quiz01 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 입력 : ");
		int act = sc.nextInt();
		
		 if((act % 4==0)&&(act % 5==0)){
			 System.out.println(true);
			
		 }
		 else {
			 System.out.println(false);
		 }
		 if((act % 4==0)||(act % 5==0)){
			 System.out.println(true);
			
		 }
		 else {
			 System.out.println(false);
		 }
		 if((act % 4==0)^(act % 5==0)){
			 System.out.println(true);
			
		 }
		 else {
			 System.out.println(false);
		 }
	}

}
