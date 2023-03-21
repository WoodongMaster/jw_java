package day01;

public class 연산자 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a의 값 " + a + " b의 값 " + b);
		a+=b;
		System.out.println("a+=b의 값 : " + a);
		System.out.println("a의 값 " + a + " b의 값 " + b);
		b+=a;
		System.out.println("b+=a의 값 : " + b);
		System.out.println("a의 값 " + a + " b의 값 " + b);

		int x=70, y=35, z=97;
		System.out.println("국영수 합계 : " + (x+y+z));
		System.out.println("국영수 평균 : " + (double)(x+y+z)/3);
	}

}
