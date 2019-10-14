package ex;

public class Student {
	
	public static void main(String[] args) {
		Student_ex studentAhn = new Student_ex();
		studentAhn.setStudentName("홍나라");
		studentAhn.setStudentNumber(20180101);
		studentAhn.setStudentage(27);
		studentAhn.setStudenttelephone("010-7777-****");
		
		Student_ex studentAhn1 = new Student_ex();
		studentAhn1.setStudentName("참이슬");
		studentAhn1.setStudentNumber(20160101);
		studentAhn1.setStudentage(25);
		studentAhn1.setStudenttelephone("010-4231-****");
		
		Student_ex studentAhn2 = new Student_ex();
		studentAhn2.setStudentName("강나루");
		studentAhn2.setStudentNumber(20170101);
		studentAhn2.setStudentage(26);
		studentAhn2.setStudenttelephone("010-1234-****");
				

		System.out.println(studentAhn.getStudentName());
		System.out.println(studentAhn.getStudentNumber());
		System.out.println(studentAhn.getStudenttelephone());
		System.out.println(studentAhn.getStudentage());
		
		System.out.println(studentAhn1.getStudentName());
		System.out.println(studentAhn1.getStudentNumber());
		System.out.println(studentAhn1.getStudenttelephone());
		System.out.println(studentAhn1.getStudentage());
		
		System.out.println(studentAhn2.getStudentName());
		System.out.println(studentAhn2.getStudentNumber());
		System.out.println(studentAhn2.getStudenttelephone());
		System.out.println(studentAhn2.getStudentage());
	}
	 
	
	

}
