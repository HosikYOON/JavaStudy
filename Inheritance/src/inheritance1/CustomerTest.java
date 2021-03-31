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
		
		System.out.println("=========�� ����========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("=======�������� ���ʽ� ����Ʈ ���=======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"���� "+cost+" ���� ���� �ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName()+"���� ���� ���ʽ� ����Ʈ�� "+ customer.bonusPoint + "���Դϴ�.");
		}
		
	}

}
