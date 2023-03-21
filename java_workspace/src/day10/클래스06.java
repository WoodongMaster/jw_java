package day10;

import java.util.Scanner;

public class 클래스06 {

	public static void main(String[] args) {
		/*	final 클래스, 변수, 메서드에 붙일 수 있음
		 *	fianl 은 수정할 수 없음
		 *	final 멤버변수 -> 상수
		 *	fianl 멤버 메서드 -> 오버라이딩 불가능
		 *	fianl 클래스 -> 상속 할 수 없다. 부모 클래스가 될 수 없음.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		EzenStudent e = new EzenStudent("인천", "홍길동","3반","01055124444");
		System.out.println(e.toString());
		
		
		  EzenStudent r = new EzenStudent(); 
		  String ch = scan.next(); 
		  r.setRegion(ch);
		  String ch1 = scan.next(); 
		  r.setStudent_name(ch1); 
		  String ch2 = scan.next();
		  r.setStudent_class(ch2); 
		  String ch3 = scan.next(); 
		  r.setStudent_phone(ch3);
		  System.out.println(r.toString());
		 
		
	}

}

class EzenStudent{
	private String region;
	private String student_name;
	private String student_class;
	private String student_phone;
	{
		
	}
	
	public EzenStudent() {	
	}
	
	public EzenStudent(String region, String student_name, String student_class, String student_phone) {
		this.region = region;
		this.student_name = student_name;
		this.student_class = student_class;
		this.student_phone = student_phone;
	}

	@Override public String toString() { 
		return "[EzenStudent region = " + region +", name = "+student_name+", class = "+student_class+", phone = "+student_phone+" ]";}
	 
	
	public void Print() {
		System.out.println(getRegion());
		System.out.println(getStudent_name());
		System.out.println(getStudent_class());
		System.out.println(getStudent_phone());
	}
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_class() {
		return student_class;
	}

	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}

	public String getStudent_phone() {
		return student_phone;
	}

	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}

	
}