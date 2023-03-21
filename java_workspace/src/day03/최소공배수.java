package day03;

public class 최소공배수 {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 7;
		int grn=1;
		
		for(int i=1;; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1+"과 "+num2+"의 최소공배수는 : "+ i);                                                      
				break;
			}
		}
		
		// 최소공배수 = 변수1 * 변수2 / 최대공약수
		for(int j=1; j<(num1+num2);j++) {
			if(j % num1 ==0 && j%num2 ==0) {
				grn=j;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최소공배수는(최대공약수로) : "+ (num1*num2)/grn);

	}

}
