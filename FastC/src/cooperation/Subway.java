package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineWay) {
		this.lineNumber = lineWay;
	}
	
	public void take(int money) { //����
		this.money += money;
		passengerCount++;
	}
	
	public void showBusINFO() {
		System.out.println(lineNumber +"ȣ���� �°��� "+ passengerCount+"�� �̰�, ������ "+money+"�Դϴ�.");
	} 
}
