package day10;

public class 클래스상속01 {

	public static void main(String[] args) {
		/*	클래스 상속 : 부모 클래스의 멤버 변수/멤버 메서드를 물려주는것
		 * 
		 * class A (부모클래스) / calss B (자식클래스)
		 * class B extends A{
		 * 
		 * }
		 * 
		 * private은 자식클래스에서 접근 x
		 * protected 자식클래스에서 접근 o
		 * 
		 */
		A a = new A();
		a.setA(10);
		a.print();
		System.out.println();
		System.out.println("-----------------");
		B b = new B();
		b.setB(20);
		b.print();
		b.num=100;
		System.out.println();
		System.out.println("-----------------");
		b.print();
	}

}

class A{
	private int a,b,c;
	protected int num;
	
	public void print() {
		
		System.out.print("a : "+a+",b : "+b+",c : "+c);
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}

class B extends A{ // a,b,c의 getter/setter 및 num,x,y,z 사용가능
	private int x,y,z;

	@Override
	public void print() {
		super.print();
		System.out.print("x : "+x+",y : "+y+",z : "+z);
	}

	/*
	 * public void print1() { super.print(); System.out.println();
	 * System.out.println("num : "+num);
	 * System.out.print("x : "+x+",y : "+y+",z : "+z); }
	 */
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}
