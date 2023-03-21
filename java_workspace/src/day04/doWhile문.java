package day04;

import java.util.Scanner;

public class doWhile문 {

	public static void main(String[] args) {
		// for, while 문은 한번도 실행 안될수도 있음 but Do문은 무조건 한번 실행
		Scanner scan = new Scanner(System.in);
		
		
		char ch;
		
		do{
			System.out.print("1~10사이 숫자를 입력해주세요 : (y/Y 입력시 종료) ");
			 ch= scan.next().charAt(0);
			System.out.println("입력된 숫자 : "+ch+" ");
			if(ch=='y' || ch=='Y') {
				System.out.println("종료!");
				break;
			}
		}
		while(true);

	}

}
