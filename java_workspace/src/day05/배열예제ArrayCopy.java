package day05;

import java.util.Scanner;

public class 배열예제ArrayCopy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int num;
		int num_cal=0;
		int sum=0;
		System.out.print("5자리 숫자를 입력해주세요 : ");
		num=scan.nextInt();
		for(int i =arr.length-1; i>=0; i--) {
			num_cal = num%10;
			arr[i]=num_cal;
			num = num/10;
			sum = sum+num_cal;
			System.out.println("num의 값 : "+num);
			
			System.out.println("arr의 값 : "+arr[i] + " ");
			
		}
		
		System.out.print("arr의 값 : ");
		for(int i : arr) {
		System.out.print(i + " ");
		}
		System.out.print("arr의 합 : " + sum);

		scan.close();
	}

}
