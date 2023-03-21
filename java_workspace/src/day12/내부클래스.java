package day12;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부클래스(=중첩클래스) : 클래스 내부에 선언한 클래스
		 * - 내부클래스를 포함한 외부클래스와 밀접한 연관이 있고 다른 외부에서 내부 클래스를 참조할 일이 없을경우 사용
		 * - 인스턴스 내부클래스, 정적(static) 내부클래스, 지역(local) 내부클래스, "익명(anonymous) 내부클래스"
		 *
		 * - 내부적으로 활용할 목적으로 만드는 클래스이기때문에 private으로 선언하는것을 권장
		 * - 내부 클래스 생성시기 : 외부클래스가 생성된 후 생성 (static은 먼저 생성되서 오류 가능)
		 * - private이 아닌 내부클래스는 다른 외부클래스에서 생성 가능
		 */
		System.out.println("외부 클래스를 이용하여 내부 클래스 메서드 호출");
		Outclass out = new Outclass();
		out.usingClass();
		
		System.out.println();
		Outclass.Inclass inclass = out.new Inclass(); // Inclass가 private이 아니라서 접근가능
		System.out.println("외부 클래스변수를 이용하여 내부 클래스 생성");
		inclass.inClassprint();
		
		System.out.println();
		System.out.println("정적(static) 내부클래스의 static 메서드 호출");
		Outclass.InStaticClass.sTest();
		
		System.out.println();
		System.out.println("정적(static) 내부클래스의 일반 메서드 호출");
		Outclass.InStaticClass sInclass = new Outclass.InStaticClass();
		sInclass.inTest();
	}

}

class Outclass{
	private int num = 10;
	private static int sNum=20;
	private Inclass in;
	
	public Outclass() {	
		in = new Inclass();
	}
	
	class Inclass{ // Outclass에서 멤버변수로 추가하는 것과 같은 효과
		int inNum=100;
//		static int sInNum=200;
		void inClassprint() {
			System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)");
			System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
		}
//		static void inarrrrr() { static이라서 오류
	}
	
	public void usingClass() {
		in.inClassprint();
	}
	
	static class InStaticClass{
		int inNum = 1000;
		static int sInNum=2000;
		void inTest() {
//			System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)");
			System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
		}
		
		static void sTest() {
//			System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)");
//			System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
			System.out.println("Inclass inNum="+sInNum+"(내부클래스의 static 변수)");
		}
	}
}