package day06;

public class 메서드05 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("1~100까지 소수의 합계 : "+sum);

	}

	public static boolean isPrime(int a) {  // boolean 메서드의 기본 리턴은 false 
		int num=0;
		for(int i=1; i<=a; i++) {
				if(a%i==0) {
					num++;
				}
		}
		if(num==2) {
			return true;
		}
		return false;
	}
}
