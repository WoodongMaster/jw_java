package day11;
import java.util.Scanner;
public class 과제 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String img[] = new String[] {".jpg",".png",".gif",".jpeg"};
		String arr[] = new String[5];
		System.out.println("5개의 파일을 입력해주세요 : ");
		for(int i=0; i<arr.length; i++){
			arr[i]=Input(); 					// arr배열에 파일받기
		}
		System.out.print("이미지파일 : ");
        Search(arr, img); // arr, img 비교
        
	}

	public static String Input() {
		String file;
		file = scan.next();
		return file;
	}

	public static void Search(String arr[], String img[]){
		for(int i =0; i<arr.length;i++) {
			for(int j=0; j<img.length;j++) {
				if(arr[i].contains(img[j])) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
}

