package day07;

import java.util.Scanner;

public class 야구게임 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int cpu[] = new int[3];
		System.out.println("-----야구게임-----");
		System.out.println("컴퓨터가 숫자를 생성하였습니다.");
		//cpu = randomArray(cpu,1,9);		

		NumCreat_HitCheck(cpu);
		scan.close();
	}
	
	public static int Creat_RandomNumber(int min, int max) { // 번호 생성 메서드
		if(max<min) {
		int tmp = max;
		max = min;
		min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}	
	
	/*
	 * public static int[] CPU_NumCreat() { int arr[] = new int[3]; for (int i = 0;
	 * i < 3; i++) { int random = Creat_RandomNumber(1, 9); if (DupCheck(arr,
	 * random)) { arr[i] = random; } else i--; } return arr; }
	 */

	public static int[] P_NumCreat() {
		int arr[] = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
	public static boolean randomArray(int arr[], int min, int max) {
		if(arr==null) {
			return false;
		}
		else if((max-min+1) < arr.length) {
			return false;
		}
			int i=0;
		while(i<arr.length) {
			int r = Creat_RandomNumber(min, max);
			if(DupCheck(arr,r)) {
				arr[i]=r;
				i++;
			}
		}
		return true;
	}
	
	public static void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.print(arr + " ");
		}
		System.out.println();
	}
	
	public static void NumCreat_HitCheck(int cpu[]) {
		int strike = 0;
		int ball = 0;
		int out = 0;
		int count = 0;

		while (strike != 3 && out != 3) {
			strike = 0;
			ball = 0;
			System.out.print("1~9까지 숫자 3개를 입력하세요 : ");
			int p[] = P_NumCreat();

			for (int i = 0; i < p.length; i++) {
				if (p[i] == cpu[i]) {
					strike++;
				}
				for (int j = 0; j < cpu.length; j++) {

					if (i != j && p[i] == cpu[j]) {
						ball++;
					}   

				}
			}
			if (strike == 0 & ball == 0) {
				out++;
			}
			count++;
			System.out.print("결과 -> 스트라이크 : " + strike + " 볼 : " + ball + " 아웃 : " + out);
			System.out.println();
		}
		if (strike == 3)
			System.out.println("이겼습니다 ! 총 시행횟수 : " + count);
		else
			System.out.println("졌습니다 ! 총 시행횟수 : " + count);
	}
	
	public static boolean DupCheck(int a[], int random) { // 중복값 있으면 true 반환 없으면 false
		for (int tmp : a) {
			if (tmp == random) {
				return false;
			}
		}
		return true;
	}

}
