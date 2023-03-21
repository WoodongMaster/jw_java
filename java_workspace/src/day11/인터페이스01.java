package day11;

public class 인터페이스01 {

	public static void main(String[] args) {
		
		/*
		 * 추상클래스, 추상메서드
		 * abstract 클래스명 , abstract 메서드명
		 * ex) abstract 리턴타입 메서드명(매개변수);
		 * 자주 호출되는 메서드는 추상 메서드로 작성
		 * 상속받은 추상 메서드는 반드시 구현
		 * 
		 * 인터페이스 : 상수와 추상메서드만으로 구성
		 * 키워드 : interface
		 * 자체적으로 사용할 수 없고, 인터페이스를 구현한 클래스로 활용
		 * 구현 키워드 : implements
		 * 인터페이스는 멤버변수 x
		 */
		Tv t = new Tv();
		t.turnOn();
		t.chanelUp();
		t.chanelDown();
		t.chanelDown();
		
		for(int i = 0; i<110; i++) {
			t.chanelUp();
		}
	}

}

interface Power{
	abstract void turnOn();
	abstract void turnOff();
}

interface Remocon{
	abstract void chanelUp();
	abstract void chanelDown();
}

// 완성 안된건 interface로 받고, 완성 된건 상속받아서..

class Tv implements Power, Remocon{
	boolean power;
	int chanel=0;
	@Override
	public void chanelUp() {
		System.out.println("채널을 올렸습니다.");
		chanel++;
		if(chanel>100) {
			chanel=0;
		}
		System.out.println(chanel);
		}
	@Override
	public void chanelDown() {
		System.out.println("채널을 내렸습니다.");
		chanel--;
		if(chanel<0) {
			chanel=100;
		}
		System.out.println(chanel);
		}
	@Override
	public void turnOn() {
		System.out.println("tv가 켜졌습니다");
		power = true;	
	}
	@Override
	public void turnOff() {
		System.out.println("tv가 꺼졌습니다");
		power = false;		
	}
	

}




