package day14;

import java.util.Calendar;
import java.util.Date;

public class date01 {

	public static void main(String[] args) {
//		Date d = new Date();
//		d.getDate(); 	// depercated 비권장

		/* 날짜시간 클래스
		 * Calendar 클래스 사용. -> 추상클래스
		 * 직접 객체 생성 불가능 (new를 통한 객체 구현 x)
		 * 
		 * getInstance()를 이용하여 값을 가져옴
		 * 
		 * month : (0월~11월) + 1
		 * week " 1=일, 2=월, 3=화 ...
		 * am_pm : am=0, pm=1
		 * 
		*/
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH);
		System.out.println(month+1);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int wk = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(wk);
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		String week = week(wk);
		
		System.out.println(year+"년"+(month+1)+"월"+day+"일 "+hour+"시"+min+"분"+sec+"초");
		System.out.println(year+"-"+(month+1)+"-"+day+"("+week+")");
		System.out.println((ampm==0?"오전":"오후")+" "+hour+":"+min);
	}
	
	public static String week(int week) {
		switch(week) {
		case 0: return "일"; 
		case 1: return "월"; 
		case 2: return "화"; 
		case 3: return "수"; 
		case 4: return "목"; 
		case 5: return "금"; 
		case 6: return "토";
		}
		return null;
	}
	
}
