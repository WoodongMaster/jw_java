package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		FoodManager fm = new FoodManager ();
		fm.printMenu();
		fm.order();

	}
}

class FoodManager{
	ArrayList<String> food = new ArrayList<String>();
	ArrayList<Integer> price = new ArrayList<Integer>();
	ArrayList<String> order_food = new ArrayList<String>();
	ArrayList<Integer> order_count = new ArrayList<Integer>();
	
	int menu,count;
	int order_menu, sum;
	Scanner scan = new Scanner(System.in);
	public void printMenu() {
		add_food();
		add_price();
	for(int i=0; i<food.size();i++) {
		System.out.println((i+1)+"."+food.get(i)+":"+price.get(i)+"원");
		}
	}
	
	public void order() {
		while(true) {
		System.out.println("메뉴를 선택해주세요 : ");
		menu = scan.nextInt();
		order_food.add(food.get(menu-1));
		System.out.println("수량을 선택해주세요 : ");
		count = scan.nextInt();
		order_count.add(count);
		sum+=(price.get(menu-1)*count);
		
		System.out.println("==선택한 메뉴==");
		System.out.println(food.get(menu-1)+""+count+"개");
		System.out.println("주문을 끝내려면 0을 눌러주세요.");
		int triger = scan.nextInt();
		
		if(triger==0) {
			break;
			}
		
	}
		System.out.println("지금까지 주문한 메뉴는 : ");
		for(int i=0; i<order_food.size(); i++)
		{System.out.println(order_food.get(i) + " " +order_count.get(i)+"개");}
		System.out.println("총 가격은 : "+sum+"원 입니다.");

	}
	
	public void add_food() {
		food.add("뼈해장국");
		food.add("잔치국수");
		food.add("햄버거");
		food.add("제육덮밥");
		food.add("돈까스");
		food.add("치즈돈까스");
		food.add("콜라");
		food.add("제로콜라");
	}
	
	public void add_price() {
		price.add(8000);
		price.add(5000);
		price.add(7000);
		price.add(6000);
		price.add(10000);
		price.add(12000);
		price.add(1500);
		price.add(1500);
	}
	
}