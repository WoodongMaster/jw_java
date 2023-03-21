package day14;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormat {

	public static void main(String[] args) throws ParseException{
		/* 날짜를 문자열로 format 설정
		 */
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd(E) hh:mm:ss");
		
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		/* 문자열을 날짜로
		 */
		
		String dateStr = "1995-11-05 08:00:00";
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2 = sdf2.parse(dateStr);
		System.out.println(date2);
	}

}
