package day02;

public class MathClass {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
		int random = (int)(Math.random()*13-6);
		System.out.println(random); // 값 확인용
		
		if(random < 0) {
			System.out.println(Math.abs(random) + "칸 후진");
		}
		else if(random == 0) {
			System.out.println("제자리");	
		}
		else {
			System.out.println(Math.abs(random) + "칸 전진");
		}
		}
			
	}

}
