package day10;

public class 클래스04 {

	public static void main(String[] args) {
		
		Car s = new Car();
		Car c = new Car();
		Car m = new Car("빨강", 2, 2);

		s.powerOn();		
		s.setColor("노랑");
		s.setDoor(2);
		s.setAirback(2);
		s.speedUp();
		s.speedUp();
		s.speedUp();
		s.print();
		System.out.println();
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.print();
		System.out.println();
		System.out.println(m);
		
	}
}
	
class Car{
	private String color;
	private int door;
	private int airback;
	private int speed;
	private boolean power;
	
	public Car(){
	}
	
	public Car(String color){
		this.color = color;
	}
	
	public Car(String color, int door){
		this.color = color;
		this.door = door;
	}
	
	public Car(String color, int door, int airback){
		this(color,door);
		this.airback=airback;
	}

	/*
	 * @Override public String toString() { return }
	 */
		
	public void print() {
		System.out.println("색상 : "+getColor());
		System.out.println("차량 문 개수 : "+getDoor());
		System.out.println("에어백 개수 : "+getAirback());
		System.out.println("스피드 : "+getSpeed());
	}
	
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
		power = true;
	}
	
	public void powerOff() {
		System.out.println("전원이 꺼졌습니다.");
		power = false;
	}
	
	public void speedUp() {
		speed = speed + 10;
		System.out.println("속도를 10km/h 올립니다.");
	}
	
	public void speedDown() {
		if(speed <= 0) {
			System.out.println("정지상태입니다.");
		}
		else {
		speed = speed - 10;
		System.out.println("속도를 10km/h 내립니다.");
		}
	}	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getAirback() {
		return airback;
	}

	public void setAirback(int airback) {
		this.airback = airback;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	
}

