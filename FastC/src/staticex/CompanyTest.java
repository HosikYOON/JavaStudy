package staticex;

import java.util.Calendar;

public class CompanyTest {
	public static void main(String[] args) {
		Company company = Company.getInstance();
		
		System.out.println(company);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.getWeekYear());
	}
}
