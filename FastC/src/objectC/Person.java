package objectC;

public class Person {
	private String name;
	private long money;
	
	
	public Person(String name, long money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee starCoffee, long money) {
		
		String beverage = starCoffee.beverage(money);
		if(money <= this.money ) {
			System.out.println(name+" 님이"+ money+"으로 별 다방 "+beverage+"를 구입하셨습니다.");
			this.money -= money;
		}
		else System.out.println("잔액이 부족하여 구매할 수 없습니다.");
	}
	public void buyBeanCoffee(BeanCoffee beanCoffee, long money) {
		String beverage = beanCoffee.beverage(money);
		if(money <= this.money ) {
			System.out.println(name+" 님이"+ money+"으로 별 다방 "+beverage+"를 구입하셨습니다.");
			this.money -= money;
		}
		else System.out.println("잔액이 부족하여 구매할 수 없습니다.");
	}
	public void howMuchMoneyIsLeft() {
		System.out.println("현제 "+name+"님의 잔액은"+money+" 원 입니다.");
	}
}
