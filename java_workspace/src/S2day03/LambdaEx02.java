package S2day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx02 {

	public static void main(String[] args) {
		/* Stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모됨
		 * 재사용 불가 -> 다른 연산을 하려면 스트림을 다시 생성해야 함
		 * 스트림 연산은 기존 자료를 변경하지 않음
		 * 중간연산 : filter ( 조건에 맞는 요소 추출) , distinct (중복제거), sorted(정렬), map(추출) ... 
		 * 최종연산 : sum(), forEach()
		*/		
		
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);

		int[] arr = {1,3,5,7};
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		int [] a = {50,70,55,10,85};
		
		int total = 0;
		for(int i = 0 ; i<a.length; i++) {
			if(a[i]>=70) {
				total += a[i];
			}
		}
		System.out.println("70점 이상의 합계(자바)"+total);
		
		
		int stream_total = Arrays.stream(a).filter(b->b>=70).sum();
		System.out.println("70점 이상의 합계(스트림)"+stream_total);
		
		ArrayList<Integer> streamlist = new ArrayList<Integer>();
		
		streamlist.add(80);
		streamlist.add(75);
		streamlist.add(71);
		streamlist.add(99);
		
		Stream<Integer> s = streamlist.stream();
		
		int listsum = streamlist.stream().filter(b->b>=70).mapToInt(n->n.intValue()).sum();
		System.out.println("list 합계");
		System.out.println(listsum);
		
		Stream<Integer> s1 = streamlist.stream();
		

		
	}
}
	


