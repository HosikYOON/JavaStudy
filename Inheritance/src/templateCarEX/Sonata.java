package templateCarEX;

public class Sonata extends Car{

	private String name;
	
	public Sonata() {
		this.name = "Sonata";
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
