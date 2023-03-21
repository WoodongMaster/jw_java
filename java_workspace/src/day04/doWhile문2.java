package day04;
import java.util.Scanner;

public class doWhile문2 {

	public static void main(String[] args) {
		/* --메뉴--
		 * 1. 저장 , 2. 출력 , 3. 종료
		 * -------
		 * 입력 : 1
		 * 저장되었습니다.
		 * 입력 : 2
		 * 출력되었습니다
		 * 입력 : 3
		 * 종료되었습니다. 반복문 종료
		 */
		Scanner scan = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.print("숫자를 입력해주세요 (1.저장, 2.출력, 3.종료) : ");
			
			num = scan.nextInt();
			switch(num) {
			case 1 :
				System.out.println("저장되었습니다.");
				break;
			case 2 :
				System.out.println("출력되었습니다.");
				break;
			case 3 :
				System.out.println("종료되었습니다.");
				break;
			default :
				System.out.println("잘못된 숫자입니다.");
				break;
			}
			
		}
		while(num!=3);
	}

}
