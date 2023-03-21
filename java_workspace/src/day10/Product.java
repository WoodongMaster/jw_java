package day10;

import java.util.Scanner;

public class Product {
	Scanner scan = new Scanner(System.in);
	private String name;
	private int price;
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void insertProduct() {
		System.out.print("상품명을 입력해주세요 : ");
		name = scan.next();
		System.out.print("상품 가격을 입력해주세요 : ");
		price = scan.nextInt();
	}
	
	public void printProduct() {
		System.out.println("상품명 : "+getName()+" 상품가격 : "+getPrice());
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
//y 누르면 while true , n 누르면 while 문 나오게 or 상품이 다 찼으면 꽉찼다고 출력
