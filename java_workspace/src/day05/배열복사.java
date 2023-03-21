package day05;

import java.util.Scanner;

public class 배열복사 {

	public static void main(String[] args) {
		/* 배열의 길이를 늘리거나 줄이고 싶을때 배열복사 ArrayCopy를 이용
		 * 
		 */
		String arr[] = new String[3];
		arr[0]= "국어";
		arr[1]= "영어";
		arr[2]= "수학";
		for(String i : arr) {
			System.out.print(i+" ");
			//Scanner scan = new Scanner(System.in);
		}
		System.out.println();
		String arr2[] = new String[6];
		
		for(int i = 0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		for(String i : arr2) {
		System.out.println(i);
		}
		
		String arr3[] = new String[arr.length*3];
		//System.arraycopy(복사할 배열, 시작번지, 새배열, 시작번지, 개수);
		System.arraycopy(arr, 0, arr3, 1, arr.length);
		
		for(String i : arr3) {
		System.out.print(i+" ");
		}
		}
	
	}

