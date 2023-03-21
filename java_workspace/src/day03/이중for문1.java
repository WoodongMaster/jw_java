package day03;
import java.util.Scanner;

public class 이중for문1 {

	public static void main(String[] args) {
		/*
		for(int i=1; i<10; i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print("*");
				
				if(j==i) {
					System.out.println();
					break;
				}
			}
			
		}
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 하나 입력하세요 : ");
		int z = scan.nextInt();
		for(int i=1; i<=z; i++) { // 층 수
			for(int j=z-i; j>0; j--) { // 공백 생성 FOR 문
				System.out.print(" "); 
			}
			for(int k=0; k<i; k++) {
				System.out.print("*"); // 별 생성 FOR문
			}
			
			System.out.println(); // 줄 바꾸기
			}
			
		for(int i=1; i<=z; i++) { // 층 수

			for(int k=0; k<i; k++) {
				System.out.print("*"); // 별 생성 FOR문
			}
			for(int j=z-i; j>0; j--) { // 공백 생성 FOR 문
				System.out.print(" "); 
			}
			
			System.out.println(); // 줄 바꾸기
			}
			
		
		}
		
	}


