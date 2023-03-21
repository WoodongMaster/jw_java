package day04;

public class 이중for문 {

	public static void main(String[] args) {
		int count=1;
		for(int i=1; i<4; i++) {
			
			for(int j=1; j<=3; j++) {
				System.out.print(count+" ");
				count ++;
			}
			System.out.println();
		}

	}

}
