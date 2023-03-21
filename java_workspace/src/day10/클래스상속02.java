package day10;

public class 클래스상속02 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.info();
		d.setName("뽀삐");
		d.info();
		d.howl();

		Cat c = new Cat("고양이", "고양이과");
		c.info();
		c.howl();
		
		Tiger t = new Tiger("호랑이", "고양이과");
		t.info();
		t.howl();
	}

}

class Animal{
	private String name;
	private String category;
	
	public Animal() {}
	
	public Animal(String name, String category) {
		this.name=name;
		this.category=category;
	}
	
	public void info() {
		System.out.println("-----------");
		System.out.println("이름 : "+name);
		System.out.println("분류 : "+category);
	}
	
	public void howl() {
		System.out.println("=="+name+" 울음소리==");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}

class Dog extends Animal{
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("멍멍~");
	}
	
	
}

class Cat extends Animal{
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("냥냥~");
	}
	
}

class Tiger extends Animal{

	public Tiger(String name, String category) {
		super(name,category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("엇흥~");
	}
	
	
}

