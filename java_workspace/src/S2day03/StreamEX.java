package S2day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEX {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		
		str.add("이순신");
		str.add("강감찬");
		str.add("권율");
		str.add("김시민");
		str.add("나보리");
		str.add("선우용녀남자");
		str.add("김치볶음밥너무좋아");
		str.add("불닭에치즈먹어봄");
		
		
		
		str.stream().map(n->n.length()).sorted().forEach(System.out::println);;
		//sorted().filter(n->n.length());
		
		System.out.println("=======================");
		
		int[] arr = {5,6,1,3,5,10,7,8,1,2,4,3};
		
		Arrays.stream(arr).sorted().distinct().filter(n->n%2==0).forEach(System.out::println);;
		
		System.out.println();
		int [] a = Arrays.stream(arr).filter(n->n%2==0).distinct().sorted().toArray();
		for(int tmp : a) {
			System.out.println(tmp + " ");
		}

	}

}
