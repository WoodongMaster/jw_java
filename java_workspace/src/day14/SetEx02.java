package day14;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetEx02 {

	public static void main(String[] args) {
		// 가장 점수가 
		int[] score = {80,98,75,48,95,62,57,80};
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}

		System.out.println("가장 작은 점수 : "+set.first());
		System.out.println("가장 큰 점수 : "+set.last());
		
		System.out.println("----------------");
		//headSet : 지정된 객체보다 작은 값 출력, tailSet : 지정된 객체보다 큰 값 출력
		System.out.println(set.tailSet(70));
		System.out.println(set.headSet(70));
		System.out.println(set.subSet(70, 90)); // subSet(a,b) a이상 b미만
		
		NavigableSet<Integer> desSet = set.descendingSet();
		
		System.out.println(desSet);
	}

}
