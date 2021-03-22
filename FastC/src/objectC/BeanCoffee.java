package objectC;

public class BeanCoffee {
	public String beverage(long money) {
		if(money == Menu.BEANAMERICANO) {
			return "아메리카노";
		}else if(money == Menu.BEANLATTE)
			return "라떼";
		else return"없는 음료";
	}
}
