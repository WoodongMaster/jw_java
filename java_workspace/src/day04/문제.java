package day04;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		/*1*50사이의 랜덤수 하나를 생성 후 맞추는 게임
		 * 예) 컴퓨터가 랜덤수를 생성 : 45
		 * 사용자 입력 : 20
		 * system : up !
		 * 사용자 입력 : 30
		 * system : up !
		 * 사용자 입력 : 49
		 * system : down !
		 * 사용자 입력 : 45
		 * system : 정답입니다!
		 */
		Scanner scan = new Scanner(System.in);
		int num = (int) (Math.random()*50+1);
		int sc = 0, count = 0;
		System.out.println("컴퓨터가 랜덤 수를 생성하였습니다. ");
		do {
			System.out.print("1~50사이 숫자를 입력해주세요 : ");
			sc = scan.nextInt();
			count ++;
			if(sc<0 || sc>50) {
				System.out.println("1~50사이 숫자가 아닙니다.");
			}
			else if(num > sc) {
				System.out.println("UP");
			}
			else if(num < sc){
				System.out.println("DOWN");
			}
			else {
				System.out.println("입력한 "+ num + "이(가) 정답입니다.");
			}
			System.out.println("총 입력한 횟수(8회안에 맞춰야합니다.) : "+count);
			if(count==8) {
				System.out.println("8회를 넘겨 종료됩니다.");
				break;
			}
		}
		while(sc!=num);
	}

}
