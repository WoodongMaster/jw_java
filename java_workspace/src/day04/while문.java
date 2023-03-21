package day04;

public class while문 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}

		System.out.println();
		
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		int j=1;
		while(j<=10) {
			if(j%2==0) {
			System.out.print(j+" ");
			}
			j++;
		}
		
		System.out.println();
		
		int k=1;
		while(k<=10) {
			if(k%2!=0){
				k++;
				continue;
			}
			else{
				System.out.print(k+" ");
			}
				k++;
			}
		}
	}

