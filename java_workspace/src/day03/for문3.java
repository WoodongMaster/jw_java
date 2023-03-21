package day03;
import java.util.Scanner;

public class for문3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			System.out.print("숫자를 입력해주세요 : ");
			int num=scan.nextInt();
			
			
			System.out.println(num+"의 약수는");
		for(int i=1; i<=num; i++) {
			if (num%i==0) {
				System.out.print(i+" ");
			}
			
		}


	}

}
