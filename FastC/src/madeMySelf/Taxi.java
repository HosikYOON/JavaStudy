package madeMySelf;

public class Taxi {

	long money;
	long distance;
	
	
	public Taxi(int distance) {
		this.distance = distance;
		this.money += distance * 100;
	}
	
	
	public long getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public void HowMuch() {
		System.out.println(distance+"m�� ���� ������ �ý� �� �����"+money+"�Դϴ�.");
	}
	
}
