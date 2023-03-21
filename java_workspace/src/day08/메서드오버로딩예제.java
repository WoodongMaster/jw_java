package day08;
import java.util.Scanner;

public class 메서드오버로딩예제 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		

		int temp_num;  

		System.out.println("2개의 정수와 연산자를 입력해주세요.(순서 상관없음)");
		String n1 = scan.next();
		String n2 = scan.next();					// 문자열로 3개 입력받음
		String n3 = scan.next();
		int tmp_n1;									
		int tmp_n2;						
		int tmp_n3;
		if(isNumeric(n1)) {							// 정수인지 연산기호인지 검사
			tmp_n1 = Integer.parseInt(n1);		// 정수면 저장
			if(isNumeric(n2)) {
				tmp_n2 = Integer.parseInt(n2);
				calc(tmp_n1, tmp_n2, n3);
			}
			else {
				tmp_n3 = Integer.parseInt(n3);
				calc(tmp_n1,n2,tmp_n3);
			}
		}
		else {											// 연산기호면 나머지 2개 문자열 정수로 저장
				tmp_n2 = Integer.parseInt(n2);
				tmp_n3 = Integer.parseInt(n3);
				calc(n1,tmp_n2,tmp_n3);
			}
		}

	public static void calc(int num1, int num2, String ch) {
		switch(ch) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println((double)num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
		default :
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
	}
	
	public static void calc(int num1, String ch, int num2) {
		switch(ch) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println((double)num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
		default :
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
	}

	public static void calc(String ch, int num1, int num2) {
		switch(ch) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println((double)num1/num2);
			break;
		case "%":
			System.out.println(num1%num2);
			break;
		default :
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
	}

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9]");
    }
}

