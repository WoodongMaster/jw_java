package day11;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* 추상클래스, 추상메서드
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
		Dog d = new Dog("강아지", "개과");
		d.printInfo();
		d.howl();
		 
		Cat c = new Cat("고양이", "고양이과"); // 자식클래스도 추상이면 구현 안해도됨 but 객체 생성 불가능
		c.printInfo();
		c.howl();
	}

}


abstract class Animal{ // 추상 클래스에서 누가 추상 메서드인지 알아야하기때문에 abstract붙힘
	protected String name;
	protected String category;
	
	public Animal() {
	}
	
	public Animal(String name, String category) {
		this.name=name;
		this.category=category;
	}

	public void printInfo() {
		System.out.println("---------");
		System.out.println("이름 : " + name);
		System.out.println("분류 : " + category);
	}
	
	abstract public void howl();
}

class Dog extends Animal{
	
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.println("울음소리 : 멍멍");
	}
	
}

class Cat extends Animal{
	
	public Cat(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	public void howl() {
		System.out.println("울음소리 : 미야옹");
	}
}
