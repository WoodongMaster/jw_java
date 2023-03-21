package day06;

public class 메서드04 {

	public static void main(String[] args) {
		
		int arr[] = dice_arr_creater();
		double average = dice_avg_cal(arr);
		dice_arr_avg_printer(arr, average);
		
	}

	public static int[] dice_arr_creater() {
		int dice_arr[] = new int[5];
		for(int i=0; i<dice_arr.length; i++) {
		dice_arr[i]=(int)(Math.random()*100+1);
		}
		return dice_arr;
	}
	
	public static double dice_avg_cal(int a []) {
		int dice_arr[] = new int[5];
		dice_arr = a;
		double sum=0;
		for(int i=0; i<dice_arr.length; i++) {
			sum +=dice_arr[i];
		}
		return sum/dice_arr.length;
	}
	
	public static void dice_arr_avg_printer(int a[], double b) {
		System.out.print("1~100사이 정수 5개를 담은 배열 출력 : ");
		for(int i : a) {
		System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("평균 : "+b);
	}
}
