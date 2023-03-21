package day07;

import java.util.Scanner;

public class 메서드08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[] {1,3,5,4,9,7,8,20,30,40,50};
		System.out.println("------정렬전-----");
		arrPrinter(arr);
		System.out.println();
		System.out.println("------정렬후-----");
		arrPrinter(sortArray(arr));
		System.out.println();
		System.out.println("--------------");
		System.out.print("배열 사이즈를 입력해주세요 : ");
		int num = scan.nextInt();
		arrPrinter(sortArray(creat_randomArray(num)));
		
		
	}
	
	public static void arrPrinter(int a[]) {
		System.out.println("<저장된 배열 출력>");
		for(int i=0; i<a.length; i++) {
			if(i%5==0 && i != 0) {
				System.out.println();
			}
			System.out.printf("%5d",a[i]);

		}
	}
	public static int[] sortArray(int a[]) {
		for(int i=0; i<a.length-1;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			
			}
		}
		return a;
	}	
	
	public static int[] creat_randomArray(int a) {
		int m_arr[]=new int [a];
		for(int i =0; i<a; i++) {
		m_arr[i] = (int)(Math.random()*100+1);
		}
		return m_arr;
		}
	}


