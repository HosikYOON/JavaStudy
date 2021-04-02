package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	
	final public void run() {
		//이 시나리오는 변하면 안 된다. 재정의 할 수 없다.
		startCar();
		drive();
		startCar();
		turnOff();  
		washCar();
	}
}
