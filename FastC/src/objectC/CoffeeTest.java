package objectC;

public class CoffeeTest {

	public static void main(String[] args) {
		Person kim = new Person("kim",10000);
		Person Lee = new Person("Lee",20000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, 4000);
		Lee.buyBeanCoffee(beanCoffee, 4500);
		kim.buyStarCoffee(starCoffee, 4000);
		Lee.buyBeanCoffee(beanCoffee, 4500);
		kim.buyStarCoffee(starCoffee, 4000);
		Lee.buyBeanCoffee(beanCoffee, 4500);

		kim.howMuchMoneyIsLeft();
		Lee.howMuchMoneyIsLeft();
	}

}
