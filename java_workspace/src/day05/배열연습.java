package day05;
import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
			/* 5명의 점수를 입력받아서 배열에 저장하고,
			 * 점수의 합계와 평균을 출력
			 * 합계 :
			 * 평균 :
			 * */
			Scanner scan = new Scanner(System.in);
			int size = 5;
			int arr[] = new int[size];
			int sum=0;
			double avg =0;
			int max=0;
			int min=0;
			System.out.println("점수를 입력해주세요. (5명)");
			for(int i=0; i<arr.length; i++) {
				arr[i]=scan.nextInt();
				sum = sum+arr[i];
				max=Math.max(max, arr[i]);
		
				min = arr[0];  // min = arr[0] 이 작업이 없으면 min은 초기값 0으로 고정되어 0으로 출력
				min=Math.min(min, arr[i]);
				
				/*
				if(arr[i] < min) {
					min = arr[i];
				}
				*/
				
			}

			avg = (double)sum/arr.length;
			
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.printf("평균 : %.2f\n", avg);
			System.out.println("최고점수 : "+max);
			System.out.println("최저점수 : "+min);
			
			scan.close();
			
		}
	}
