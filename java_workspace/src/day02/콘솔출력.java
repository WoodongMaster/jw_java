package day02;

public class 콘솔출력 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 5;
		double num3=5, num4=3;
		System.out.print(num1 + num2);
		System.out.println(num1 + num2);
		System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		System.out.println(num3+" / "+num4+" = "+(num3/num4));
		System.out.printf("%.0f / %.0f = %.2f\n", num3, num4, (num3/num4));
	}

}
