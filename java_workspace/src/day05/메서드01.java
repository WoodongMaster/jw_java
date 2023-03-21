package day05;

public class 메서드01 {

	public static void main(String[] args) {
		/* 메서드 : 기능 / 함수
		 * 접근제한자 : 접근할 수 있는 주체의 제한범위
		 * 리턴타입 (void) : 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드 명 : 메서드 이름 (소문자 시작)
		 * 매개변수 : 메서드를 실행하기위해서 필요로 하는 값
		 * 메서드 선언 및 구현
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 기능구현;
		 * }
		 * 
		 */ 
		int result = sum(1,3); // 호출한 sum의 값을 저장할 변수
		System.out.println(result);

	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 합을 알려줌 (int)
	 * 메서드 명 : sum
	 * 매개변수 : 두 정수(int num1, int num2) 
	 */
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
