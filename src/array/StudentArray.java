package array;

public class StudentArray {

	public static void main(String[] args) {
		Student[ ] ID = new Student [3];
		
		ID [0] = new Student("1001","James");
		ID [1] = new Student("1002","Tomas");
		ID [2] = new Student("1003","Edward");
		
		for (int i = 0; i < ID.length; i++) {
			ID[i].showStudentInfo( );
		}
	
	}

}
