package day11;

public class 다형성02 {

	public static void main(String[] args) {
		/* 다형성 : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
		 * 같은 코드에서 다른 실행결과 획득 가능
		*/
		Animal1 h = new Human();
		Animal1 t = new Tiger();
		Animal1 e = new Eagle();
		
		/*
		 * if(h instanceof Human) { Human human = (Human)h; human.read(); }
		 */
		
		Animal1[] AnimalList = new Animal1[3];
		
		AnimalList[0]=e;
		AnimalList[1]=h;
		AnimalList[2]=t;
		
		Downcasting(AnimalList);
		/*
		 * 다형성02 test = new 다형성02(); test.moveAnimal(h); test.moveAnimal(t);
		 * test.moveAnimal(e);
		 */
	}
	
	public void moveAnimal(Animal1 animal) { // 각자의 객체가 아닌 부모 클래스를 사용하여 호출 (다형성)
		animal.move();
	}

	public static void Downcasting(Animal1[] list) {
		
		for(int i = 0; i<list.length; i++) {
		if(list[i] instanceof Human) {
			System.out.println("--리스트" + i + "번째 휴먼객체--");
			Human human = (Human)list[i];
			human.move();
			human.read();
		}
		else if(list[i] instanceof Tiger) {
			System.out.println("--리스트" + i + "번째 호랑이객체--");
			Tiger tiger = (Tiger)list[i];
			tiger.move();
			tiger.hunting();
		}
		else{
			System.out.println("--리스트" + i + "번째 독수리객체--");
			Eagle eagle = (Eagle)list[i];
			eagle.move();
			eagle.flying();
		}
	}	
}

}
class Animal1{
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
}

class Human extends Animal1{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void read() {
		System.out.println("사람이 공부를 합니다.");
	}
	
}

class Tiger extends Animal1{
	public void move() {
		System.out.println("호랑이가 어슬렁 거립니다");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal1{
	public void move() {
		System.out.println("독수리는 날아다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 두 날개를 폅니다.");
	}
}