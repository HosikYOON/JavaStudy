package inheritance1;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer SKim = new Customer(10001, "Kim");
		Customer SLee = new Customer(10002, "Lee");
		Customer GPark = new GoldCustomer(10003, "Park");
		Customer GSin = new GoldCustomer(10004, "Sin");
		Customer VYoon = new VIPCustomer(10005, "Yoon");

		customerList.add(SKim);
		customerList.add(SLee);
		customerList.add(GPark);
		customerList.add(GSin);
		customerList.add(VYoon);
		
		System.out.println("=========고객 정보========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("=======할인율과 보너스 포인트 계산=======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost+" 원을 지불 하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+ customer.bonusPoint + "점입니다.");
		}
		
	}

}
