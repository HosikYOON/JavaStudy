package objectC;

public class BeanCoffee {
	public String beverage(long money) {
		if(money == Menu.BEANAMERICANO) {
			return "�Ƹ޸�ī��";
		}else if(money == Menu.BEANLATTE)
			return "��";
		else return"���� ����";
	}
}
