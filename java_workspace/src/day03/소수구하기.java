package day03;
import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		// 소수 : 약수가 1과 자기 자신만
		/*
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("숫자를 입력해주세요 : ");
		int z = scan.nextInt();
		
		for(int i =1 ; i<=z; i++) {
				if(z%i==0) {
					num ++;
				}
				
		}
		if(num==2) {
				System.out.println(z+"의 약수 개수는 "+num+"개 입니다. 소수임");	
		}
		else
				System.out.println(z+"의 약수 개수는 "+num+"개 입니다. 소수아님");
				
		*/
		
		
		for(int i =1 ; i<=100; i++) 
		{
			int num = 0;
			for(int j=1; j<=i; j++) 
			{
					if(i%j==0) 
					{
						num++;
					}
			}
				if(num==2) 
				{ 
					System.out.print(i+" ");
				}
			//num=0;
		}
	}
	}
