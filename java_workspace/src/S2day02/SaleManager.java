package S2day02;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	Scanner scan = new Scanner(System.in);
	private ArrayList<Sale<String,Integer>> product = new ArrayList<>();
	private ArrayList<Sale<String,Integer>> order = new ArrayList<>();
	
	public void add() {
		System.out.print("제품명 : ");
		String menu = scan.next();
		System.out.print("가격 : ");
		int price = scan.nextInt();
		
		Sale s = new Sale(menu,price);
		product.add(s);
		
	}
}
