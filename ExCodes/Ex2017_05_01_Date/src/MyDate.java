
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		year = 1970;
		month = day = 1;
	}
	
	/////////////// methods
	public void setDate(int y, int m, int d) {
		year = y; month = m; day = d;
	}
	
	public void showDate() {
		System.out.println(year+"."+month+"."+day);
	}
	
	private int maxDay(int y, int m) {
			
		int days=0;
		switch(m) {
		case 1:	case 3:	case 5:	case 7:
		case 8:	case 10: case 12: 
			days = 31; break;
		case 2:
			days = ((y%4==0 && y%100!=0)||y%400==0)?29:28; break;
		case 4:	case 6:	case 9:	case 11:
			days=30; break;		
		}
		return days;
	}
	
	private void nextDay() {
		day++;
		int MaxDay = maxDay(year, month);
		if(day>MaxDay) { day=1; month++; }
		if(month>12) { year++; month=1; }
	}
	
	private void prevDay() {
		if(--day==0) {
			if(--month==0) { month = 12; year--; }
			int maxDay = maxDay(year, month);
			day = maxDay;
		}
	}
	
	public void nextDay(int nDays) {
		for(int i=0;i<nDays;i++) nextDay();
	}
	public void prevDay(int nDays) {
		for(int i=0;i<nDays;i++) prevDay();
	}
}
