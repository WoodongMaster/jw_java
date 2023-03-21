package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int des = 30;  // 목적지
		int count = 0; // 시행 횟수

		do {	//des보다 커지면 종료하게끔
		System.out.println("주사위를 굴려 목적지까지 도달하세요 : (y / Y 입력시 굴림)  ");
		char ch = scan.next().charAt(0); // 시작 입력
			if(ch=='y' || ch=='Y') {
				int dice_num = (int)(Math.random()*6+1); // 주사위 눈 발생
				System.out.println("나온 주사위 눈 : " + dice_num);
				System.out.println(dice_num+"만큼 전진합니다.");
				des = des-dice_num;
					if(des<0) {
						break;
					}
					System.out.println("남은 거리 : "+des);
				count++;
			}

			else
				{
				System.out.println("잘못된 키 입력! y 혹은 Y를 눌러주세요.");
				}
		}
		while(des > 0);

		System.out.println("완주하였습니다! 주사위 굴린 횟수 : " + count);
		}

	}

