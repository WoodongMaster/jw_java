package day10;

import java.util.Scanner;

public class ProducetMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product p[] = new Product[10];
		int cnt=0;
		int price=0;
		char b=0;		
			
		while(true) {
			System.out.print("상품을 등록하시겠습니까? (y/n) : ");
			b = scan.next().charAt(0);
			
			if(b=='y' && cnt<10) {
					Product tmp = new Product();
					tmp.insertProduct();
					p[cnt] = tmp;
					price += p[cnt].getPrice();
					cnt++;
			}
			
			if(b=='n' || cnt>=10) {
				for(int i=0; i<cnt; i++) {
					p[i].printProduct();	
				}
				break;
			}
			else {
				System.out.println("y 혹은 n 을 입력해주세요.");
			}
		}
		System.out.println("총 가격 : "+price);

		scan.close();
	}
}
