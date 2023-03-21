package day03;

public class Continue문 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			
			if(i==5) {
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			
			if(i%2!=0) {
				continue; // 홀수면 패스
			}
			
			System.out.print(i+" ");
		}
		

	}

}
