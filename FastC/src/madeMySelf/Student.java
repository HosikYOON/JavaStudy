package madeMySelf;

public class Student {
	String studentName;
	long money;
	
	public Student(String studentName ,long money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void take(Taxi taxi) {
		long a = taxi.getMoney();
		this.money -= a;
	}
	
	public void StudentInfo() {
		System.out.println(studentName + "¥‘¿« ≥≤¿∫ µ∑¿∫ "+ money +"¿‘¥œ¥Ÿ." );
	}
}
