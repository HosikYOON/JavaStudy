package reference;

public class StudentMain {

	public static void main(String[] args) {
		Student studentK = new Student(123,"kim");
		studentK.koreanSetScore("국어", 100, 001);
		studentK.MathSetScore("수학",100,002);
		studentK.EnglishSetScore("영어", 95, 003);
		
		Student studentY = new Student(122,"yoon");
		studentY.koreanSetScore("국어", 100, 001);
		studentY.MathSetScore("수학",100,002);
		studentY.EnglishSetScore("영어", 100, 003);
		
		studentK.Print_student();
		studentY.Print_student();
	}

}
