package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들은 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 멈춤니다.");
	}

}
