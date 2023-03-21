package day10;

public class 클래스05 {

	public static void main(String[] args) {
		TV t = new TV();
		t.printPower();
		System.out.println(TV.brand);	// 클래스 멤버 변수 접근
		TV.printBrand();			// 클래스 멤버 메서드 접근
		
		String[] A = new String [5];
		for(String i : A) {
			System.out.println(i);
		}
	}

}

class TV{
	private boolean power;
	public final static String brand = "Samsung"; // fianl = 최종, 수정불가능
	
	public void printPower() {
		if(power) {
			System.out.println("TV가 켜져있습니다.");
		}
		else {
			System.out.println("TV가 꺼져있습니다.");
		}
		System.out.println("제조사:" + brand);
	}
	
	public static void printBrand() {
		System.out.println("제조사:" + brand);
		// System.out.println(power); 불가능, static 변수가 아니라서
	}
	
	public void powerOn() {
		power = true;
		System.out.println("TV가 켜졌습니다.");
	}
	public void powerOff() {
		power = false;
		System.out.println("TV가 꺼졌습니다.");
	}
}