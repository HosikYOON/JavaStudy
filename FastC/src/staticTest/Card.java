package staticTest;

public class Card {

	public static int numbar = 10000;
	private int CardNumber;
	
	public Card() {
		
	}
	public int getCardNumber() {
		return CardNumber;
	}
	
	public void setCardNumber() {
		CardNumber = ++numbar;
	}
	
}
