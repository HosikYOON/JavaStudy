package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if((day >= 1)&& (day<=31))
			this.day = day;
		else
			System.out.println("\'��\'�� �� �� �Է� �ϼ̽��ϴ�.");
	}
	
	
	public int getDay() {
		return day;
	}


	public int getMonth() {
		return month;
	}


	public int getYear() {
		return year;
	}

	
	public void setMonth(int month) {
		if((month >= 1)&&(month <= 12))
			this.month = month;
		else
			System.out.println("\'��\'�� �� �� �Է� �ϼ̽��ϴ�.");
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showDate() {
		System.out.println(this.year +"��\n"+this.month+"��\n"+ this.day+"��\n" );
	}
}
