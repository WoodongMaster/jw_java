package day01;

public class IF문1 {

	public static void main(String[] args) {
		int num1=1;
		if(num1 > 0) {
			System.out.println("num1은 0보다 큽니다.");
		}
		else if(num1==0) // else if 는 여러번 가능 
		{ 
			System.out.println("num1은 0이 맞습니다.");
		}
		else // else는 마지막에 한번만 가능 
		{
			System.out.println("num1은 0보다 작습니다.");
		}
		
		int num2 = 3;
		if (num2 % 2 ==0) {
			System.out.println("num2는 "+num2+"이고 짝수입니다.");
		}
		else {
			System.out.println("num2는 "+num2+"이고 홀수입니다.");
		}
	}
}