package chapter4;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		// 100일 후
		cal.set(2010, 10, 10);
		cal.add(Calendar.DATE, 100);
		printDate(cal);

	}
	
	private static void printDate(Calendar cal) {
		
		// DAY 변경불가
		final String[] DAYS = {"일", "월", "화", "수", "목", "금", "토"};
		
		// 년
		int year = cal.get(Calendar.YEAR);
		
		// 월 (0~11, +1)
		int month = cal.get(Calendar.MONTH);
		
		// 일
		int date = cal.get(Calendar.DATE);
		
		// 요일 1=일요일 7=토요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		// 시
		int hours = cal.get(Calendar.HOUR);
	
		// 분
		int minute = cal.get(Calendar.MINUTE);
		
		// 초
		int second = cal.get(Calendar.SECOND);
		
		// "2021-10-20 22:30:20"
				System.out.println(
						year + "년 " +
						(month + 1) + "월 " +
						date + "일 " +
						DAYS[day-1] + "요일 " +
						hours + "시" +
						minute + "분" + 
						second + "초");
	}
}