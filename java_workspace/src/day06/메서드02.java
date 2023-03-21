package day06;

public class 메서드02 {

	public static void main(String[] args) {
		/* Method = 기능함수
		 * - 접근제한자 : 접근할 수 있는 주체의 제한범위
		 * - 리턴타입 : 메서드 실행 후 결과로 얻을 수 있는 값(자료형으로 표현)
		 * - 메서드명 : 메서드를 구분하는 명 (소문자로 시작, 카멜표기법 사용)
		 * - 매개변수 : 기능을 수행하기 위해 필요로 하는 정보값
		 * - void : 반활할 값이 없는 경우
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 기능구현;
		 * 리턴타입이 있을 경우 반드시 return; 포함 (void의 경우 리턴값 x)
		 * }
		 * 
		 * 리턴을 할경우 그 값을 받을 변수 or 배열 설정 (메서드의 값을 여러군데 활용할 경우 리턴 후 값 저장)
		 */
		int hap = sum(100,200);
		System.out.println(hap);
		
		sumPrint(3,30);
		mulPrint(3,30);
		
	}
	public static int sum(int a, int b) {
 		
		return a + b ;
	}
	
	public static void sumPrint(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public static void mulPrint(int a, int b) {
		System.out.println(a*b);
		
	}
}
