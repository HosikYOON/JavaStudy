package hiding;

public class MydateTest {

	public static void main(String[] args) {

		MyDate mydate = new MyDate();
		
		mydate.setDay(19);
		mydate.setMonth(03);
		mydate.setYear(2021);
		mydate.showDate();
		
		
		MyDate date2 = new MyDate();
		date2.setYear(2020);
	}	
}
