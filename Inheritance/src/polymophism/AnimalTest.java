package polymophism;


class Animal{
	public void move() {
		System.out.println("��������");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("��� ����");
	}
	public void read() {
		System.out.println("��� å ��");
	}
}
class Tigal extends Animal{
	public void move() {
	System.out.println("ȣ���� ����");
	}
	public void hunt() {
		System.out.println("ȣ�� ���");
	}
}
class Eagle extends Animal{
	public void move() {
	System.out.println("������ ����");
	}
	public void fly() {
		System.out.println("�� ����");
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
