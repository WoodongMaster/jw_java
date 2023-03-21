package day11;

public class 다형성01 {

	public static void main(String[] args) {
		A a = new A();
		a.num = 10;
		System.out.println(a);
		
		
		A b = new B(); // A를 기반으로 B객체 생성
		b.num = 10; 
		System.out.println(b);
		

	}

}

class A{
	int num;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "num="+num;
	}
	

	
}

class B extends A{

}