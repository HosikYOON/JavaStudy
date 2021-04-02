package interfaceEx;

public class CalcTest {

	public static void main(String[] args) {
		CompleteCalc calcurator = new CompleteCalc();
		System.out.println(calcurator.add(2, 5));
		System.out.println(calcurator.substract(7, 4));
		System.out.println(calcurator.times(1,3));
		System.out.println(calcurator.divide(9, 3));
		
		calcurator.showInfo();
	}

} 
