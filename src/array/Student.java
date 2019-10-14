package array;

public class Student {
	private String studentID;
	private String Name;
	
	public Student( ) { } 
	
	public Student (String studentID,String Name) {
		this.studentID = studentID;
		this.Name = Name;
	}

	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void showStudentInfo() {
		System.out.println(studentID + "," + Name);
	}
}

