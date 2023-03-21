package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개로 저장, key/value 값으로 저장
		 * - key는 중복불가, value는 중복가능
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer> map = new HashMap();
		 * Map은 값이 2개여서 Iterator를 사용할 수 없음
		 * Map -> Set으로 변경후 출력
		 * 
		 * list, set -> .add() .get(index);
		 * map -> .put();			// 추가
		 * getKey(), getValue();	// 추출
		*/
		HashMap<String, Integer> map = new HashMap();
		map.put("햄버거", 15000);
		map.put("불고기", 12000);
		map.put("순두부찌개", 10000);
		map.put("콜라", 1500);
		map.put("마카롱", 30000);
		map.put("콜라", 2000);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.get("햄버거"));
		
		System.out.println("===Iterator 이용===");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		System.out.println();
		System.out.println("===향상된 for문 이용===");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println();
		System.out.println(map);
		System.out.println(map.entrySet());
		System.out.println();
		System.out.println("===entrySet 이용===");
		for(Map.Entry<String, Integer> tmp : map.entrySet()) {
			System.out.println(tmp);
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
		
		int sum = 0;
		for(Integer tmp : map.values()) {
			sum += tmp;
			System.out.println("sum값 변화 : " + sum);
		}
		
		sum=0;
		for(String tmp : map.keySet()) {
			
			sum += map.get(tmp);
			System.out.println("sum값 변화 : " + sum);
		}
		
	}

}
