package inheritance1;

public class VIPCustomer extends Customer {
	
	
	double salesRatio;
	private int agentID = 12345;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;	
	
	
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price -(int)(price * salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}
	
}
