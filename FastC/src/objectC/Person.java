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
			System.out.println(name+" ����"+ money+"���� �� �ٹ� "+beverage+"�� �����ϼ̽��ϴ�.");
			this.money -= money;
		}
		else System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
	}
	public void buyBeanCoffee(BeanCoffee beanCoffee, long money) {
		String beverage = beanCoffee.beverage(money);
		if(money <= this.money ) {
			System.out.println(name+" ����"+ money+"���� �� �ٹ� "+beverage+"�� �����ϼ̽��ϴ�.");
			this.money -= money;
		}
		else System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
	}
	public void howMuchMoneyIsLeft() {
		System.out.println("���� "+name+"���� �ܾ���"+money+" �� �Դϴ�.");
	}
}
