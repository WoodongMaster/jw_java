package day06;
import java.util.Scanner;

public class 과제 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num[] = number_enter(); // 넘버 2개 입력받기
		int ch = menu();
		switch(ch) {
		case 1 :
			add(num);
			break;
		case 2 :
			sub(num);
			break;
		case 3 :
			mul(num);
			break;
		case 4 :
			div(num);
			break;
		case 5 :
			rem(num);
			break;
		default :
			System.out.println("보기에 없는 숫자입니다.");
			break;
		}
		scan.close();
	}
	
	public static int[] number_enter() {
		int num[] = new int[2];
		System.out.println("숫자를 2개 입력하세요 : ");
		num[0] = scan.nextInt();
		num[1] = scan.nextInt();
				
		return num;
	}
	
	public static int menu() {
	System.out.print("원하는 계산을 선택해주세요(1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.나머지) : ");
	int ch = scan.nextInt();

	return ch;
	}
	
	public static void add(int a[]) {
		System.out.println("덧셈 결과 : " + (a[0]+a[1]));
	}
	
	public static void sub(int a[]) {
		System.out.println("뺄셈 결과 : " +(a[0]-a[1]));
	}
	
	public static void mul(int a[]) {
		System.out.println("곱셈 결과 : " +(a[0]*a[1]));
	}
	
	public static void div(int a[]) {
		System.out.println("나눗셈 결과 : " +((double)(a[0]/a[1])));
	}
	
	public static void rem(int a[]) {
		System.out.println("나머지 결과 : " +(a[0]%a[1]));
	}
	
}
