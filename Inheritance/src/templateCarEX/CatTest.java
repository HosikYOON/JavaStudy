package templateCarEX;

import java.util.ArrayList;

public class CatTest {

	public static void main(String[] args) {
		
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Avante());
		carList.add(new Grandeur());
		carList.add(new Genesis());
		
		for(Car car: carList) {
			car.run();
			System.out.println("===========");
		}

	}

}
