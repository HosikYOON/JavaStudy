package thisex;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	
	public void showINFO() {
		System.out.println(name+","+age);
	}
}
