package hiding;

public class MyDate {

	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if((day >= 1)&& (day<=31))
			this.day = day;
		else
			System.out.println("\'日\'을 잘 못 입력 하셨습니다.");
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
			System.out.println("\'月\'을 잘 못 입력 하셨습니다.");
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showDate() {
		System.out.println(this.year +"년\n"+this.month+"월\n"+ this.day+"일\n" );
	}
}
