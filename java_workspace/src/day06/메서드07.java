package day06;

import java.util.Scanner;

public class 메서드07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		System.out.print("문자를 입력해주세요 : ");
		String shape = scan.next();
		
		shp(num, shape);
		scan.close();
	}

	public static void shp(int a, String b) {
		for(int i=0; i<a; i++) {
			System.out.print(b);	
		}
		System.out.println();
	}
	
}
