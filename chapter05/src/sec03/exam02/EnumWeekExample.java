package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY)
			System.out.println("일요일에 css 프로젝트 합니다");
		else if(today == Week.MONDAY)
			System.out.println("자바 공부합니다");
		else if(today == Week.TUESDAY)
			System.out.println("css 공부합니다");
		else if(today == Week.WEDNESDAY)
			System.out.println("HTML 공부합니다");
		else if(today == Week.THURSDAY)
			System.out.println("집안일을 합니다");
		else if(today == Week.FRIDAY)
			System.out.println("조금 일찍 잡니다");
		else
			System.out.println("병원에 갑니다");
	}

}
