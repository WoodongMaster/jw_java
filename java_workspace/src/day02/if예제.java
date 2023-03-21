package day02;

import java.util.Scanner;

public class if예제 {

	public static void main(String[] args) {
		// 정수를 입력받아서 정수가 짝수인지 홀수인지 판단하여 출력.
		Scanner scan = new Scanner(System.in);
		int a=0;
		System.out.println("정수를 입력해주세요.");
		a = scan.nextInt();
		if(a%2==0) {
		System.out.println("입력받은 정수는 짝수입니다.");
		}	
		else {
			System.out.println("입력받은 정수는 홀수입니다.");
		}
		
	}
}