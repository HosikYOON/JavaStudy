package staticTest;

public class CardCompanyTest {
	
	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.CreateCard();
		Card yourCard = company.CreateCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
	
	}
}
