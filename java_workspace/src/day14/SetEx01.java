package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class SetEx01 {

	public static void main(String[] args) {
			
		HashSet<Integer> random = new HashSet<Integer>(); // 그냥 넣는 SET
		
		TreeSet<Integer> set = new TreeSet<>(); // 정렬이 추가된 SET
		
		while(set.size()<6) {
			int a = new Random().nextInt(45)+1;
			set.add(a);
		}
		System.out.println(set);
		System.out.println(set.first()); // 첫번째꺼
		System.out.println(set.last());	// 마지막꺼
		System.out.println(set.pollFirst()); // 첫번째꺼 빼오고 지움
		System.out.println(set.pollLast()); // 마지막꺼 빼오고 지움
		
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
				int tmp = it.next();
				System.out.print(tmp+" ");
		}
		System.out.println();
		
		for(int tmp : set) {
			System.out.print(tmp+" ");
		}
	}

}
