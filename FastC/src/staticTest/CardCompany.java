package staticTest;

public class CardCompany {

	private static CardCompany instance = new CardCompany();
	
	
	private CardCompany() {
		
	}
	
	public Card CreateCard() {
		Card x = new Card();
		x.setCardNumber();
		return x;
	}
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
}
