package templateCarEX;

public class Genesis extends Car {

	private String name;
	
	public Genesis() {
		this.name = "Genesis";
	}
	@Override
	public void start() {
		System.out.println(name+" 시동을 겁니다.");
	}

	@Override
	public void drive() {
		System.out.println(name+" 달립니다");
		
	}

	@Override
	public void stop() {
		System.out.println(name+" 멈춤니다.");
		
		
	}

	@Override
	public void turnOff() {
		System.out.println(name+" 시동을 끕니다.");
		
	}
}
