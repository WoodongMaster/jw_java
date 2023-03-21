package day07;

public class 클래스 {

	public static void main(String[] args) {
		/*
		 * 클래스 - 설계도
		 * 객체를 생성하기 위한 설계도
		 * 메서드 - 기능
		 * 
		 * 클래스 구성정보
		 * - 속성 : 멤버변수
		 * - 기능 : 메서드
		 * 
		 * ex) 프린터 클래스
		 * - 속성() : 크기, 색, 제조사, 제조명, 인쇄방식
		 * - 기능 : 인쇄, 스캔, 팩스, 복사 등
		 * 
		 * 멤버변수는 클래스 안, 메서드 위에 작성
		 * 멤버변수는 클래스 안에서 사용할 수 있음.
		 * 
		 * 접근제한자 class 클래스명(반드시 대문자로 시작){
		 * 
		 * }
		 * 
		 * - 객체 선언 및 초기화
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * - 멤버 메서드 사용하는법
		 * 객체명.메서드명();
		 * # 같은 클래스 안에 있는 메서드 호출시 메서드 명으로 호출 가능 -> 메서드명();
		 * # 다른 클래스 안에 있는 메서드 호출시 객체를 이용하여 사용 -> 객체명.메서드명();
		 * 
		 * 접근제한자(제어자)
		 * -public = 호출 제한없음
		 * -protected = 호출 제한 (나 + 패키지 + 자식클래스)
		 * -(default) = 호출 제한 (나 + 패키지) 
		 * -private = 호출 제한 (나)
		 * 
		 * 클래스에서 public을 붙일 수 있는건 파일명과 클래스명이 같을때만 가능.
		 * 멤버변수나 메서드는 public을 붙이는 것에 제한이 없음
		 * 
		 * 일반적으로 멤버변수는 private, 메서드는 public
		 * private으로 선언된 멤버변수는 getter/setter를 통해 변수에 접근 가능
		 * 
		 *  
		 */
		Point1 p = new Point1();
		p.Print();
		p.move(3, 5, 10);
		p.Print();
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.getZ());
		
		p.setX(100);
		p.setY(100);
		p.setZ(100);

		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p.getZ());
		
		p.Print();
		
	}

}

class Point{
	// 멤버변수는 초기화 안해도 0 or null로 초기화 됨
	private int x;
	private int y;
	
	public void Print() {
		System.out.println("("+x+","+y+")");
	}
	
	public void Move(int x, int y) {
		this.x = x; // this. 을 붙히면 멤버변수를 가리킴
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
}

class Point1{
	private int x,y,z;
	
	public void Print() {
		System.out.println("(x,y,z) = "+"("+x+","+y+","+z+")");
	}
	
	public void move(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void setZ(int z) {
		this.z=z;
	}
}
