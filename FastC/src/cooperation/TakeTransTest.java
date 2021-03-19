package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentY = new Student("yoon",10000);
		Student studentK = new Student("Kim",20000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subway2 = new Subway(2);
		Subway subway4 = new Subway(4);
		
		studentY.takeBus(bus100);
		studentK.takeSubway(subway4);
		
		studentK.showINFO();
		studentY.showINFO();
		
		bus100.showBusINFO();
		bus200.showBusINFO();
		subway2.showBusINFO();
		subway4.showBusINFO();
		
	}

}
