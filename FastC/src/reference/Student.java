package reference;

public class Student {

	int studentID;
	String studentName;
	
	Subject korean;
	Subject Math;
	Subject English;
	
	public Student(int id, String name) {
		
		this.studentID = id;
		this.studentName = name;
		
		korean = new Subject();
		Math = new Subject();
		English = new Subject();
	}
	
	public void koreanSetScore(String name, int score, int SUB_ID) {
		korean.s_name = name;
		korean.s_score = score;
		korean.s_ID = SUB_ID;
	}
	
	public void MathSetScore(String name, int score, int SUB_ID) {
		Math.s_name = name;
		Math.s_score = score;
		Math.s_ID = SUB_ID;
	}
	
	public void EnglishSetScore(String name, int score, int SUB_ID) {
		English.s_name = name;
		English.s_score = score;
		English.s_ID = SUB_ID;
	}
	
	public void Print_student() {
		System.out.println(studentName +"학생의 "+ korean.toString());
		System.out.println(studentName +"학생의 "+ Math.toString());
		System.out.println(studentName +"학생의 "+ English.toString());
		
	}
}
