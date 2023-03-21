package day07;
public class Lotto예제 {
	public static void main(String[] args) {
		int lotto[] = new int[7];
		int user[] = new int[6];

		GetNumberArray(lotto);
		GetNumberArray(user);

		System.out.print("로또 랜덤 번호 : ");
		Array_Printer(lotto);
		System.out.println();
		System.out.print("나의 랜덤 번호 : ");
		Array_Printer(user);
		System.out.println();
		Win_Checker(lotto, user);
	}
	
	public static int Creat_RandomNumber(int min, int max) { // 번호 생성 메서드
		if(max<min) {
		int tmp = max;
		max = min;
		min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}	

	public static int[] GetNumberArray(int a[]) { // 생성번호 배열에 담는 메서드
		while(true) {
			for(int i=0; i<a.length; i++) {
				a[i]=Creat_RandomNumber(1,45);	
				}
			if(Array_Checker(a)) {
				break;
			}
		}
		return a;
	}
	
	public static void Array_Printer(int a[]) { // 배열 출력 메서드
		for(int i : a) {
		System.out.print(i + " ");
		}
	}

	public static boolean Array_Checker(int a[]) { // 배열 중복 확인 메서드
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void Win_Checker(int l[], int u[]) { // 등수 확인 메서드
		int hit=0;
		int bonus=0;
		for(int i=0; i<l.length-1;i++) {
			for(int j=0; j<u.length; j++) {
				if(l[i]==u[j]) {
					hit ++;
				}
			}
		}

		for(int i=0; i<u.length; i++) {
			if(l[l.length-1]==u[i]) {
				bonus++;
			}
		}
		
		switch(hit) {
		case 0 :
			System.out.println("맞은 개수 : "+hit);
			System.out.println("꽝 입니다!");
			break;
		case 1 :
			System.out.println("맞은 개수 : "+hit);
			System.out.println("꽝 입니다!");
			break;
		case 2 :
			System.out.println("맞은 개수 : "+hit);
			System.out.println("꽝 입니다!");
			break;
		case 3 :
			System.out.println("맞은 개수 : "+hit);
			System.out.println("꽝 입니다!");
			break;
		case 4 :
			System.out.println("맞은 개수 : "+hit);
			System.out.println("4등 입니다!");
			break;
		case 5 :
			System.out.println("맞은 개수 : "+hit);
			System.out.println("3등 입니다!");
			break;
		case 6 :
			if(bonus==1) {
			System.out.println("맞은 개수 : "+(hit+bonus));
			System.out.println("2등 입니다!");	
			}
			else {
			System.out.println("맞은 개수 : "+hit);
			System.out.println("1등 입니다!");
			}
			break;
		}

	}

}

