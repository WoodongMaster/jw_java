package day06;

import java.util.Scanner;

public class 메서드03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double dou[] = new double [2];
		
		
		System.out.println("두 정수를 입력해주세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("+ - * / % 중 선택해주세요 ");
		String ch = scan.next();
		switch(ch) {
		case "+" :
			add(num1, num2);
			break;
		
		case "-" :
			sub(num1, num2);
			break;
			
		case "*" :
			mul(num1, num2);
			break;			
			
		case "/" :
			if(num2==0) {
				System.out.println("0으로는 나눌 수 없습니다.");
				break;
			}
			div(num1, num2);
			break;
			
		case "%" :
			dou = remain(num1, num2);
			System.out.println("몫 : " +dou[0]+" "+"나머지 : "+dou[1]);
			break;
			
		default :
			System.out.println("잘못된 연산자 입니다.");
			}
		
		scan.close();
	
	}

	public static void add(int a, int b) {
		System.out.print("더하기 결과 : " + (a+b));
	}
	
	public static void sub(int a, int b) {
		System.out.print("빼기 결과 : " + (a-b));
	}
	
	public static void mul(int a, int b) {
		System.out.printf("곱하기 결과 : %f", (a*b));
	}
	
	public static void div(int a, int b) {
		System.out.print("나누기 결과 : " + (double)(a/b));
	}
	
	public static double[] remain(int a, int b) {
		//System.out.print("나눈 나머지 결과 : " + (a%b));
		double rem[] = new double [2];
		rem[0] = a/b;
		rem[1] = a%b;
		return rem;
	}
}
