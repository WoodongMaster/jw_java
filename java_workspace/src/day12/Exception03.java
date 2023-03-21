package day12;

public class Exception03 {

	public static void main(String[] args) {
		
		
		//ArithmeticException (0으로 나눴을때 발생)
//		double a = 1/0;
//		System.out.println(a);

		//ArrayIndexOutOfBoundsException (배열 index가 범위를 벗어났을때 발생)
//		int arr[] = new int [5];
//		for(int i = 0; i<=arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//ClassCastException (클래스 형변환 오류)
//		P p = new P();
//		C c = (C)p;
		
		//NullPointerException (객체가 생성되지 않았을 경우)
//		C c = null;
//		c.print();
	}

}

class P{
	int num = 10;
}

class C extends P{
	int num1 = 100;
	void print() {
		System.out.println(num1);
	}
}