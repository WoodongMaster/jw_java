package day12;

public class Exception05 {

	public static void main(String[] args) {
		int test[];
		try {
		test = creatArr(10,5,5);
		System.out.println();
		creatArr2(test, 7, 3);
		
		System.out.println();
		
		test = creatArr(10,5,0);
		System.out.println();
		creatArr2(test, 7, 3);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int[] creatArr(int max, int min, int size) throws Exception{
		if(size ==0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if(max<=0) {
			throw new RuntimeException("max의 범위가 0보다 작습니다.");
			}
		
		int arr[] = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
		arr[i]=(int)(Math.random()*(max-min+1))+min;
		System.out.print(arr[i]+" ");
		}

		
			return arr;
	}
	
	public static void creatArr2(int arr[], int max, int min) throws Exception{
		if(arr==null) {
			throw new RuntimeException("배열이 없습니다.");
		}
		if(arr.length==0) {
			throw new Exception("배열의 길이가 0입니다.");
		}
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*(max-min+1))+min;
			System.out.print(arr[i]+" ");
		}

	}
}
