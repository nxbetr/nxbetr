package com.yedam.java.ch11_04;

import java.util.Calendar;

public class CalendarClassExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();      // new연산자를 통해 인스턴스 생성불가

		int year = cal.get(Calendar.YEAR);          // get이라는 메소드에 캘린더가 가진 정적 필드를 가져옴
		int month = cal.get(Calendar.MONTH)+1;      // 0부터 시작하니까 +1을 통해 1부터 시작하게 함
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;

		switch (week) {
		case Calendar.MONDAY:  // 필드값과 같으면 월
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
		}

		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");

	}

}
