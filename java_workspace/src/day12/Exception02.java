package day12;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try{
			System.out.println(Calc(10, 0, "+"));
			System.out.println(Calc(10, 0, "-"));
			System.out.println(Calc(10, 0, "@"));
			System.out.println(Calc(10, 0, "*"));
			System.out.println(Calc(10, 0, "/"));
			System.out.println(Calc(10, 0, "%"));
			System.out.println(Calc(10, 0, "$"));
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("계산기종료");
	}

	public static double Calc(int a, int b, String c) throws RuntimeException {
		double result =0;
		
		if((c=="/" || c=="%") && b == 0) {
			throw new RuntimeException("b는 0이 될수 없습니다.");
		}
		
		switch(c) {
		case "+" :
			result = a+b;
			break;
		case "-" :
			result = a-b;
			break;
		case "*" :
			result = a*b;
			break;
		case "/" :
			result = a/b;
			break;
		case "%" :
			result = a%b;
		default:
			throw new RuntimeException(c+"는 산술연산자가 아닙니다.");
		}

		return result;
	}
}
