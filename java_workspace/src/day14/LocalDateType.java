package day14;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateType {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		String curr = today.toString();
		System.out.println(curr);

		System.out.println(curr.substring(5)); // 5번째 인덱스까지 삭제후 전체 출력
		System.out.println(curr.substring(0,5)); // 0~5번째 인덱스까지 출력
		System.out.println(curr.substring(0, curr.indexOf("T"))); // 0~ "T"위치 전까지 출력
		
		System.out.println(curr.substring(curr.indexOf("T")+1, curr.indexOf(".")));
		
		System.out.println();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30, 50);
		System.out.println(sDate.format(dtf));
	}

}
