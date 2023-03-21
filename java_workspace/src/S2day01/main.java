package S2day01;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		
		ProgramManager pm = new ProgramManager();
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("== 학생관리 메뉴 ==");
			System.out.println("1. 학생등록");
			System.out.println("2. 전체 학생확인");
			System.out.println("3. 학생검색");
			System.out.println("4. 수강신청");
			System.out.println("5. 수강취소");
			System.out.println("6. 종료");
			
			System.out.print("원하는 메뉴 번호를 입력해주세요 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				pm.insertStudent();
				break;
			case 2:
				pm.printStudent();
				break;
			case 3:
				pm.searchStudent();
				break;
			case 4:
				pm.registerSubject();
				break;
			case 5:
				pm.deleteSubject();
				break;
			case 6:
				break;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}
			
		}while(menu != 6);
		
		System.out.println("프로그램 종료!");
		
		scan.close();
	}

}
