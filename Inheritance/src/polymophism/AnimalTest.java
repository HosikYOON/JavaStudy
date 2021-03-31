package polymophism;


class Animal{
	public void move() {
		System.out.println("움직움직");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람 움직");
	}
	public void read() {
		System.out.println("사람 책 읽");
	}
}
class Tigal extends Animal{
	public void move() {
	System.out.println("호랑이 움직");
	}
	public void hunt() {
		System.out.println("호랑 사냥");
	}
}
class Eagle extends Animal{
	public void move() {
	System.out.println("독수리 움직");
	}
	public void fly() {
		System.out.println("새 날다");
	}
}

	

public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tigal();
		Animal eAnimal = new Eagle();
		
		//Eagle human = (Eagle)hAnimal;
		if(hAnimal instanceof Human) {
			Human human = (Human)hAnimal;
			human.read();
		}
		
	
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
	}
	
	
	public void moveAnimal(Animal animal ) {
		
		animal.move();
	}
	
	public void downCasting() {
		
	}

}
