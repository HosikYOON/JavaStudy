package hidingMakeMyself;

public class Mydate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = false;
	
	public Mydate(int day, int month, int year) {
		setMonth(month);	
		setDay(day);
		setYear(year);
				
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		if(1 <= month && month <= 12) {
			this.month = month;
			isValid = true;
		}
	}
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8:case 10: case 12:
				if(1 <= day && day <= 31) {
					this.day = day;
					isValid = true;
				}else {
					isValid = false;
				}
			case 4:case 6:case 9:case 11:
				if(1 <= day && day <= 30) {
					this.day = day;
					isValid = true;
				}else {
					isValid = false;
				}
			case 2:
				if((year % 4 == 0 && year % 100 == 0 )||(year % 400 == 0)){
					if(1 <= day && day <= 29) {
						this.day = day;
						isValid = true;
					}else isValid = false;
				}else {
					if(1 <= day && day <= 28) {
						this.day = day;
						isValid = true;
					}else isValid = false;
				}
		}
	}

	public String isValid() {   // public boolean isValid() 사용해서 String을 return할 수 있을까?
		if(isValid) return "유효한 날짜입니다.";
		else return "유효하지 않은 날짜입니다.";
	}
	
	public int getYear() {
		return year;
	}
	

	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
}
