package day05;

import java.util.Scanner;

public class String예제 {

	public static void main(String[] args) {
		String[] fileName = {"java의 정석.txt","이것이 java다.jpg","String 메서드.txt","String 함수.jpg","java의 정석 표시.jpg"};
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("목록 : java의 정석.txt, 이것이 java다.jpg, String 메서드.txt, String 함수.jpg, java의 정석 표시.jpg");
		System.out.print("단어를 입력하세요 : ");
		String ch = scan.next();
		int count=0;
			for(int i=0; i<fileName.length;i++) {
				
				if(fileName[i].contains(ch)) {
					System.out.println(fileName[i]);	
					count ++;
				}
			}
			
			if(ch.equals("y") || ch.equals("Y")){
				System.out.println("종료합니다.");
				break;
				}
			
			if(count == 0) {
				System.out.println("검색값이 없습니다.");
			}
			
			

			
			
		}
		scan.close();
	}

}
