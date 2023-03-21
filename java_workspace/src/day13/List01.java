package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		// 하루일과를 저장하는 list 생성
		ArrayList<String> daily_list = new ArrayList<String>();
		
		daily_list.add("기상");
		daily_list.add("샤워");
		daily_list.add("아침밥");
		daily_list.add("등교");
		daily_list.add("학원");
		daily_list.add("점심밥");
		daily_list.add("학원");
		daily_list.add("하교");
		daily_list.add("저녁밥");
		daily_list.add("동물의숲 하기");
		daily_list.add("유튜브 보기");
		daily_list.add("웹툰 보기");
		daily_list.add("취침");
		
		System.out.println("==일반 for문==");
		for(int i=0; i<daily_list.size();i++) {
			System.out.print(daily_list.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("==향상된 for문==");
		for(String tmp : daily_list) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("==Iterator문==");
		Iterator<String> it = daily_list.iterator();
		while(it.hasNext()) {	//.hasNext() 다음요소가 있는지 체크 true/false
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("==contains==");
		String a = "학원";
		System.out.println(daily_list.contains(a));
		
		Collections.sort(daily_list);
		System.out.println(daily_list);
		
		daily_list.sort(new Test());
		System.out.println(daily_list);

	}

}

class Test implements Comparator<String>{
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
