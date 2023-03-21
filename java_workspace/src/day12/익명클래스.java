package day12;

public class 익명클래스 {

	public static void main(String[] args) {
//		Tv t = new Tv();
//		product(t);
		
		/* 익명클래스 : 인터페이스에서 미구현된 클래스를 사용할때
		 * <익명클래스를 사용할 조건>
		 *-인터페이스의 기능이 적고, 해당 객체가 하나만 필요한 경우
		 *-메서드의 매개변수로 주로 사용
		 */
		
		product(new Power() {

			@Override
			public void turnOn() {
				System.out.println("전원이 켜졌습니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원이 꺼졌습니다.");
				
			}
			
		});
	}

	public static void product(Power p) {
		p.turnOn();
		System.out.println("tv가 작동중입니다.");
		p.turnOff();
//		System.out.println("tv가 꺼졌습니다.");
	}
}

interface Power{
	void turnOn();
	void turnOff();
}

//class Tv implements Power{
//
//	@Override
//	public void turnOn() {
//		System.out.println("전원이 켜졌습니다.");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("전원이 꺼졌습니다.");
//		
//	}
//	
//	
//}