package day03;

public class 최대공약수 {

	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 80;
		int max = 0;
		System.out.print(num1+"과 "+num2+"의 공약수는 : ");
		for(int i=1; i<(num2+num1); i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.print(i+" ");
				max = i;
						
			}
		}
		System.out.println();
		System.out.println(num1+"과 "+num2+"의 최대공약수는 : " + max);
		

	}

}
