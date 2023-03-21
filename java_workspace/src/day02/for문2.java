package day02;

public class for문2 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			System.out.print(i+"단  ");
			for(int j=1; j<10; j++) {
			int result = 0;
			result = i*j;
			System.out.print(i +" * "+ j + " = "+result+"  ");
			}
			System.out.println();
		}
	}
}
		 /*
		int result_odd=0;
		int result_even=0;
		for(int i=1; i<11; i++) {
			if(i%2==0)
			{
				result_even+=i;
			}
			else {
				result_odd+=i;
			}
		}
		System.out.println("1~10까지 홀수의 합 : " + result_odd);
		System.out.println("1~10까지 짝수의 합 : " + result_even);
		
	}	
}
*/