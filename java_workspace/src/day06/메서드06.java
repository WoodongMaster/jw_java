package day06;

import java.util.Scanner;

public class 메서드06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단을 출력할 숫자를 입력하세요. : ");
		int num=scan.nextInt();
		Mul(num);
		scan.close();
	}

	public static void Mul(int a) {
		System.out.println(a+"단");
		for(int i=1; i<10; i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
	
}
