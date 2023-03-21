package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열 대신 사용
		 * 
		 * List : 배열과 동일
		 *  - 값을 하나씩 저장
		 *  - 순서를 보장
		 *  - 중복을 허용
		 * 
		 * Set
		 *  - 값을 하나씩 저장
		 *  - 순서를 보장X (index 없음)
		 *  - 중복 X
		 *  
		 * Map
		 *  - 값을 두개 저장, key/value 쌍으로 저장
		 *  - key 중복 불가, value는 중복 가능
		 *  - key가 중복되면 덮어쓰기 됨
		 *  - 아이디/패스워드처럼 같이 묶어서 하나의 자료로 저장해야할 때 사용
		 *  
		 *  int arr[]; : 기본 자료형 사용가능
		 *  collection에서는 어떤 클래스로 데이터를 관리할지 지정해야 함.
		 *  
		 *  int -> Integer, String, 나머지 자료형들은 첫글자만 대문자로 변환 (Byte, Boolean ...)
		 *  클래스를 지정하지 않으면 object가 자동으로 들어감
		*/
		
		//List list1 = new List(); // error
//		List list1 = new ArrayList(); //object 클래스가 자동지정
//		ArrayList list2 = new ArrayList(); //object 클래스가 자동지정
		
		ArrayList<Integer> list = new ArrayList<Integer>(); // 숫자만
		ArrayList<String> list2 = new ArrayList<String>(); // 문자열만
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//size() : list의 총 개수 length와 같은 의미
		System.out.println(list.size());
		
		list2.add("abc");
		list2.add("def");
		list2.add("xyz");
		list2.add("ijk");
		list2.add("123");
		
		System.out.println(list2);
		System.out.println(list2.size());
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for(int i = 1; i<11; i++) {
			list3.add(i);
		}
		System.out.println(list3);
		System.out.println(list3.size());
	
		System.out.println(list3.get(1)); // get(index) : index번지 값 가져오기
		list3.set(0,5);					  // .set(index, 값) : index번지 값으로 바꾸기
		System.out.println(list3);
		list3.remove(0);			//  , .remove(index) 해당하는 인덱스 삭제
		System.out.println(list3);
		
		Integer a = 10;
		list3.remove(a);               // .remove(objec) 해당하는 값 삭제
		System.out.println(list3);
		
		Integer b = 5;
		System.out.println(list3.contains(b)); // .contains(object) 있으면 true 없으면false
		
		list3.clear();					// .clear() 리스트 삭제
		System.out.println(list3);
		
		System.out.println(list3.isEmpty()); // .isEmpty() 리스트가 비었는지 확인 비었으면 true 차있으면 false
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		for(int i = 5; i>=0; i--) {
			list4.add(i);
		}
		
		for(int i=0;i<list4.size();i++) {
		System.out.print(list4.get(i)+" ");
		}
		
		System.out.println();
		for(int tmp : list4) {
			System.out.print(tmp+" ");	
		}
		
		// Iterator : 컬렉션 출력용
		/* list는 순서를 보장해서 .get(index) 사용가능 but .set(index, value)는 사용 불가능해서 향상된 for문 or Iterator사용 
		*/
		System.out.println();
		Iterator<Integer> it = list4.iterator();
		while(it.hasNext()) {	//.hasNext() 다음요소가 있는지 체크 true/false
			Integer tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		//indexOf(값) : 해당 값의 list index 번지를 반환 / 없으면 -1 반환
		Integer c = 5;
		System.out.println(list4.indexOf(c));
		
		//Collections.sort(list4); //오름차순
		//System.out.println(list4);
		
		
		//sort(객체)
		// - 객체 : Comparator 인터페이스를 구현한 객체를 넣어야함(익명클래스 사용)
		// - 비교(compare) 메서드를 사용하여 객체를 정렬
		list4.sort(
				new Comparator<Integer>(){
			public int compare(Integer o1, Integer o2){
		
			return o2-o1; // o1-o2=오름차순 , o2-o1=내림차순
		}
		});
		System.out.println(list4);
	}
	
}
 