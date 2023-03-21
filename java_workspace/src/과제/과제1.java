package 과제;

import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("========1번========");
		String ans = "a:b:c:d";
		System.out.println("이전 문장 : "+ans);
		
		String ans2 = ans.replace(':', '?');
		System.out.println("바뀐 문장 : "+ans2);
		
		System.out.println("========2번========");
		String 홍길동 = "881120-1068234";
		String fix = 홍길동.substring(0,6);
		System.out.println("생년월일 : "+fix);
		
		
		String gender = 홍길동.substring(7,8); 
		if(gender.equals("1")) {
			gender = "남자";
		}
		else {
			gender = "여자";
		}
		System.out.println("성별"+gender);
		
		System.out.println("========3번========");
		System.out.print("1~100까지의 숫자중 하나를 입력해주세요 : ");
		int num = scan.nextInt();
		
		for(int i =1; i<=num; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("========4번========");
		
		System.out.print("월을 입력해주세요! : ");
		int season = scan.nextInt();
		
		switch(season) {
		case 12: case 1: case 2:
			System.out.println(season+"월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(season+"월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(season+"월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(season+"월은 가을입니다.");
			break;
		default :
			System.out.println("1~12월 사이를 입력해주세요.");
			break;
		}
		
		System.out.println("========5번========");
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
