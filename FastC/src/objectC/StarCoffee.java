package objectC;

public class StarCoffee {
	
	public String beverage(long money) {
		if(money == Menu.STARAMERICANO) {
			return "�Ƹ޸�ī��";
		}else if(money == Menu.STARLATTE)
			return "��";
		else return"���� ����";
	}
}
