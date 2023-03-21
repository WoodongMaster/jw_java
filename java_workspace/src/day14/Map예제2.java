package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map예제2 {

	private HashMap<String, Integer> map = new HashMap();
	Scanner scan = new Scanner(System.in);
	int total = 0;
	
	public static void main(String[] args) {
		// map에 상품명과 가격을 입력받고 출력
		// 총 지불가격 출력
		// 입력-> 메서드 , 출력 -> 메서드
		Map예제2 ex2 = new Map예제2();
		
		ex2.Input();
		ex2.Output();	
	}
	
	public void Input(){
				System.out.println("몇개의 상품을 등록하시겠습니까?");
				int a = scan.nextInt();
		while(map.size()<a) {
	    	  System.out.print("상품명 : ");
	    	  String name = scan.next();
	    	  System.out.print("가격 : ");
	    	  int price = scan.nextInt();
	    	  
	    	  map.put(name, price);
	    	  total += price;
	      }
	}
	
	public void Output(){
		System.out.println("=====등록된 상품=====");
		
	    Iterator<String> it = map.keySet().iterator();
	    while(it.hasNext()) {
	  	  String name = (String)it.next();
	  	  int price = map.get(name);
	  	  System.out.println("상품명 : "+name+" 가격 : "+price+"원");  
	      }
	    System.out.println("==== 총 금액 : "+total+"원 ====");
	}
}
