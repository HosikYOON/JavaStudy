package reference;

public class StudentMain {

	public static void main(String[] args) {
		Student studentK = new Student(123,"kim");
		studentK.koreanSetScore("����", 100, 001);
		studentK.MathSetScore("����",100,002);
		studentK.EnglishSetScore("����", 95, 003);
		
		Student studentY = new Student(122,"yoon");
		studentY.koreanSetScore("����", 100, 001);
		studentY.MathSetScore("����",100,002);
		studentY.EnglishSetScore("����", 100, 003);
		
		studentK.Print_student();
		studentY.Print_student();
	}

}
