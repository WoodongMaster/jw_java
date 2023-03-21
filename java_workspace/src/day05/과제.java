package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보 (가위 = 0 , 바위 = 1 , 보 = 2)
		 * 내가 가위 바위 보 선택
		 * 승 패 무 결과 출력
		 * p_rsp 0 -> 0 draw 1 lose 2 win
		 * p_rsp 1 -> 0 win 1 draw 2 lose
		 * p_rsp 2 -> 0 lose 1 win 2 draw
		 */
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int g_count = 0;
		
		while(count<5) {
			System.out.print("컴퓨터와 가위바위보 게임 5회 실시(가위 0, 바위 1, 보 2) : ");
			int cpu_rsp = (int)(Math.random()*3);
			int p_rsp = scan.nextInt();
			// String p_rsp = (p_rsp == 0) ? "가위" : (p_rsp==1) ? "바위" : "보"
			
			
			if(cpu_rsp == p_rsp) {
				System.out.println("무승부");
				count ++;
				continue;
			}
			
			switch(p_rsp) {
			
			case 0 : 
				System.out.println("플레이어 : 가위 ");
				if(cpu_rsp==1) {
					System.out.println("컴퓨터 : 바위");
				}
				else {
					System.out.println("컴퓨터 : 보");
				}
				System.out.println((p_rsp+1 == cpu_rsp) ? "졌습니다." : "이겼습니다.");
				//cpu_rsp.equals("바위") ? "졌습니다." : "이겼습니다.";
				count ++;
				break;
				
			case 1 :
				System.out.println("플레이어 : 바위 ");
				if(cpu_rsp==0) {
					System.out.println("컴퓨터 : 가위");
				}
				else {
					System.out.println("컴퓨터 : 보");
				}
				System.out.println((p_rsp+1 == cpu_rsp) ? "졌습니다." : "이겼습니다.");
				count ++;
				break;
				
			case 2 :
				System.out.println("플레이어 : 보 ");
				if(cpu_rsp==1) {
					System.out.println("컴퓨터 : 바위");
				}
				else {
					System.out.println("컴퓨터 : 가위");
				}
				System.out.println((p_rsp-2 == cpu_rsp) ? "졌습니다." : "이겼습니다.");
				count ++;
				break;
				
			default :
				System.out.println("잘못된 숫자입니다.");
			}
			
		}
		
		scan.close();
		
	}

}
