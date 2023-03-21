package day08;

import java.util.Scanner;

public class 클래스02 {

	public static void main(String[] args) {
		Car c = new Car();
		Scanner scan = new Scanner(System.in);
		
		if(!c.isPower()) {
			System.out.println("시동이 꺼져있습니다.");
		}
		
		c.PowerOn();
		System.out.println(c.isPower());
		/*
		 * System.out.println("차량 스피드를 설정하세요 : "); int ch = scan.nextInt();
		 * c.setSpeed(ch);
		 * 
		 * System.out.println("차량 색깔을 설정하세요 : "); String co = scan.next();
		 * c.setColor(co);
		 */
		
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.PowerOff();
		c.speedDown();
		
		Car c2 = new Car();
		System.out.println(c2.getColor());
		System.out.println(c2.isPower());
		System.out.println(c2.getSpeed());
		c2.setColor("빨강");
		System.out.println(c2.getColor());
		c2.PowerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		
		scan.close();
	}

}

class Car{
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private int speed;
	private boolean power;
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	private String color="흰색";
	
	public void PowerOn() {
			System.out.println("시동이 켜졌습니다.");
			power = true;
	}
	
	public void PowerOff() {
			System.out.println("시동이 꺼졌습니다.");
			power = false;
	}

	public void speedUp() {
		if(power) {
			
		
			if(speed>200) {
				System.out.println("제한 속도 초과 ! 더이상 가속이 불가능합니다.");
			}
			else
				speed = (speed + 10);
			System.out.println("속도 + 10");
			System.out.println(color+"의 현재속도 : " + speed);
		}
		else {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
		}
	}
	
	public void speedDown() {
	if(power) {
		System.out.println("속도 - 10");
		if(speed >0) {
		speed = (speed - 10);
		}
		System.out.println(color+"의 현재속도 : " + speed);
			}
	else {
		System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
	}
}
	
}