package day12;

public class 과제 {

	public static void main(String[] args) {
		// 채널 0~10까지, 순환구조
		// vol 0~20까지 0이 되면 음소거라고 출력
		// vol 0아래로 안내려감, 20위로 올라가지않음
		Tv tv = new Tv();
		System.out.println("전원 안킴");
		tv.chanelUp();
		tv.chanelDown();			
		tv.volUp();
		tv.volDown();
		
		System.out.println();
		tv.turnOn();
		tv.chanelUp();
		tv.chanelDown();
		tv.chanelDown();	
		tv.volUp();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.volUp();
	}
}

interface Remocon{
	void turnOn();
	void turnOff();
	void chanelUp();
	void chanelDown();
	void volUp();
	void volDown();
}

class Tv implements Remocon{
	boolean power;
	int chanel=0;
	int vol=0;
	
	public void turnOn() {
		if(!power)
		power = true;
		System.out.println("tv를 켭니다.");
	}
	public void turnOff() {
		if(power)
		power = false;
		System.out.println("tv를 끕니다");
	}
	
	public void chanelUp() {
		if(power){
		chanel++;
		if(chanel>10) {
			chanel=0;
			}
		System.out.println("채널을 올립니다. 현재채널 : "+chanel);
		}
		else {
			System.out.println("tv를 켜주세요");
		}
	}
	public void chanelDown() {
		if(power) {
		chanel--;
		if(chanel<0) {
			chanel=10;
			}
		System.out.println("채널을 내립니다. 현재채널 : "+chanel);
		}
		else {
		System.out.println("tv를 켜주세요");
		}	
	}
	
	public void volUp() {
		if(power) {
		if(vol>=20) {
			System.out.println("최대 볼륨입니다.");
			vol=20;
		}
		else {
			vol++;
			System.out.println("볼륨을 올립니다. 현재볼륨 : "+vol);
		}
		}
		else {
			System.out.println("tv를 켜주세요");
		}
	}
	public void volDown() {
		if(power) {
		if(vol<=1) {
			System.out.println("음소거 상태입니다.");
			vol=0;
		}
		else {
			vol--;
			System.out.println("볼륨을 내립니다. 현재볼륨 : "+vol);
		}
		}
		else {
			System.out.println("tv를 켜주세요");
		}
	}
	public int getChanel() {
		return chanel;
	}
	public void setChanel(int chanel) {
		this.chanel = chanel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}	
}