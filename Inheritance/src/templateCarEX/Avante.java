package templateCarEX;

public class Avante extends Car {

	private String name;
	
	public Avante() {
		this.name = "Avante";
	}
	@Override
	public void start() {
		System.out.println(name+" �õ��� �̴ϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(name+" �޸��ϴ�");
		
	}

	@Override
	public void stop() {
		System.out.println(name+" ����ϴ�.");
		
		
	}

	@Override
	public void turnOff() {
		System.out.println(name+" �õ��� ���ϴ�.");
		
	}
}
