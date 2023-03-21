package day03;

import java.util.Scanner;

public class for문4번break {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int i = 1;
		int sum=0;
		for(;;) {
			System.out.print(i+" ");
			sum+=i;
			if(i==100) {
				break;
			}
			i++;
		}
		System.out.println();
		System.out.println("1부터 100까지의 합 : "+sum);
		
		System.out.println("------------------------------------");
		
		for(;;) {
		System.out.print("문자 하나를 입력해주세요 : (Y/y 입력시 종료) " );
		char ch = scan.next().charAt(0);
			if(ch=='y' || ch=='Y') {
				System.out.println("종료");
				break;
			}
		}
	}

}
