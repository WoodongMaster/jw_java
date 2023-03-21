package day05;

public class 배열예제 {

	public static void main(String[] args) {
		int size = 5;
		int arr[] = new int[size];
		
		System.out.print("5칸의 배열 생성 : ");
		for(int i=0 ; i<arr.length; i++) {
			int random = (int)(Math.random()*50+1);
			arr[i] = random;
			System.out.print(arr[i] +" ");	
		}
		
	}

}
