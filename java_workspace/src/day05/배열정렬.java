package day05;

public class 배열정렬 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		
		for(int i=0 ; i<arr.length;i++) {
			int random = (int)(Math.random()*50+1);
			arr[i] = random;
			
		System.out.print(arr[i]+" ");	
		}
		System.out.println();
		
		int min=0;
		int max = arr.length;
		
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*max+min);
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		System.out.println("------섞은 후-------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) { // if로 오름차순 정렬
			for(int j=i+1; j<arr.length; j++) {
			if(arr[i] > arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			}
		}
		
		System.out.println("------오름차순 정렬후-------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
			if(arr[i] < arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			}
		}
		
		System.out.println();
		System.out.println("------내림차순 정렬후-------");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		int a = 10;
		int b = 20;
		int	tmp=a;
		a=b;
		b=tmp;
		
		System.out.println("a : "+a+", b : "+b );
		
	}


}
