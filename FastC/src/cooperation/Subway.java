package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineWay) {
		this.lineNumber = lineWay;
	}
	
	public void take(int money) { //승차
		this.money += money;
		passengerCount++;
	}
	
	public void showBusINFO() {
		System.out.println(lineNumber +"호선의 승객은 "+ passengerCount+"명 이고, 수입은 "+money+"입니다.");
	} 
}
