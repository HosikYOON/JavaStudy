package madeMySelf;

public class TakeTrafficTest {

	public static void main(String[] args) {
		Student studentE = new Student("Edward",34200l);
		Taxi taxi = new Taxi(100);
		
		studentE.take(taxi);
		taxi.HowMuch();
		studentE.StudentInfo();

	}

}
