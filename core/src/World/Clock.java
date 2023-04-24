package World;

import java.util.HashMap;

public class Clock {
	int hour = 0;
	int day = 1;
	String month;
	int year = 0;
	
	HashMap<String, Integer> months = new HashMap<String, Integer>();
	private void initMonths() {
		month = "january";
		months.put("january", 31);
		months.put("febuary", 28);
		months.put("march", 31);
		months.put("april", 30);
		months.put("may", 31);
		months.put("june", 30);
		months.put("july", 31);
		months.put("august", 31);
		months.put("september", 30);
		months.put("october", 31);
		months.put("november", 31);
		months.put("december", 31);
	}
	public Clock(){
		initMonths();
	}
	
	public void count(int amount) {
		hour += amount;
		updateDay();
	}
	
	private void updateDay() {
		if (hour >= 24) {
			day += 1;
			hour = 0;
			updateMonth();
		}
	}
	private void updateMonth() {
		if (day > months.get(month)) {
			nextMonth();
			day = 1;
		}
	}
	private void nextMonth() {
		switch(month) {
		case "january": month = "febuary"; break;
		case "febuary": month = "march"; break;
		case "march": month = "april"; break;
		case "april": month = "may"; break;
		case "may": month = "june"; break;
		case "june": month = "july"; break;
		case "july": month = "august"; break;
		case "august": month = "september"; break;
		case "september": month = "october"; break;
		case "october": month = "november"; break;
		case "november": month = "december"; break;
		case "december": month = "january"; year ++;break;
			
		}
	}
	
	
	public int getYear() {
		return year;
	}
	
	public String getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getHour() {
		return hour;
	}
	
	
}
