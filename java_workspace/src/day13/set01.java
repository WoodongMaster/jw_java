package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class set01 {

	public static void main(String[] args) {
		/* set : 순서보장x 중복x
		 * 자주쓰는 set -> HashSet
		 * index가 없음
		 */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("melon");
		set.add("peach");
		set.add("apple");
		set.add("이순신");
		set.add("홍길동");
		
		System.out.println(set);
		
		for(String tmp : set) {
			System.out.println(tmp+ " ");
		}
		
		System.out.println();
		System.out.println("Iterator 출력");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
				String tmp = it.next();
				System.out.print(tmp+" ");
		}
		
		System.out.println();
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(list);
	}

}
