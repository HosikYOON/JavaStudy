package objectC;

public class StarCoffee {
	
	public String beverage(long money) {
		if(money == Menu.STARAMERICANO) {
			return "아메리카노";
		}else if(money == Menu.STARLATTE)
			return "라떼";
		else return"없는 음료";
	}
}
