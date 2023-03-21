package day08;

public class 메서드오버로딩 {

	public static void main(String[] args) {
		System.out.println(sum(3,10));
		System.out.println(sum(3.1,10.1));
		System.out.println(sum(1,2,3,4,5,6,7,8,9));
		int arr[] = {15,78,62,97,58,55,44,32,11};
		System.out.println(sum(arr));
		}
	public static int sum(int num1, int num2) {
		return (num1+num2);
	}
	public static int sum(int num1, int num2, int num3) { // 매개변수 개수가 다르면 오버로딩
		return (num1+num2+num3);
	}
	public static double sum(double num1, double num2) { // 매개변수 종류가 다르면 오버로딩 #1 (전부 다르게)
		return (num1+num2);
	}
	public static double sum(int num1, double num2) { // 매개변수 종류가 다르면 오버로딩 #2 (하나만 다르게) 
		return (num1+num2);
	}	
	public static double sum(double num1, int num2) { // 매개변수 종류가 다르면 오버로딩 #3 (#2에서 위치변경)
	return (num1+num2);
	}	
	public static int sum(int ...num) { // 가변길이 메서드 (매개변수 num이 몇개가 들어와도 상관없음)
		int sum=0;
		for(int i = 0; i<num.length; i++) {
			sum=sum+num[i];
		}
		return sum;
	}
}
