package day10;

public class EzenComputer {
	/* 학생 기본정보 : 이름, 생년월일, 나이, 전화번호
	 * 학원정보 : 학원이름 = "EZEN" ,지점   // fianl 처리
	 * 수강정보 : 수강과목(기간) // 5칸 배열로
	 * 
	 * 한명이 여러과목 수강 가능
	 */
	private String student_name;
	private String birth;
	private String age;
	private String phone;
	public final static String arcademy_name="EZEN";
	private String arcademy_region;
	private String Class_name[]= new String [5];
	private int cnt;
	
	public EzenComputer() {	}
	
	public EzenComputer(String student_name, String birth, String age, String phone, String arcademy_region) {
		this.student_name = student_name;
		this.birth = birth;
		this.age = age;
		this.phone = phone;
		this.arcademy_region = arcademy_region;
	}
	
	public EzenComputer(String student_name,String phone, String arcademy_region) {
		this.student_name = student_name;
		this.phone = phone;
		this.arcademy_region = arcademy_region;
	}
	
	public void Student_print() {
		System.out.println("이름 : "+student_name);
		System.out.println("생년월일 : "+birth);
		System.out.println("나이 : "+age);
		System.out.println("번호 : "+phone);	
	}
	
	public void Arcademy_print() {
		System.out.println("학원 이름 : "+arcademy_name);
		System.out.println("지점 : "+arcademy_region);
	}
	
	public void Class_print() {
		System.out.print("과목명 : ");
		for(int i =0; i<cnt; i++) {
			if(Class_name[i]!=null) {
			System.out.print(Class_name[i]+" ");
			}
		}
	}
	
	public void Class_in(String a) {
		for(int i =0; i<Class_name.length; i++) {
			if(Class_name[i]==null) {
			Class_name[i]=a;
			break;
			}
		}
	}
	
	public void Class_del(int a, String b) {
			Class_name[a-1]=b;	
		}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getArcademy_region() {
		return arcademy_region;
	}

	public void setArcademy_region(String arcademy_region) {
		this.arcademy_region = arcademy_region;
	}

	public String[] getClass_name() {
		return Class_name;
	}

	public void setClass_name(String class_name) {
		for(int i=0; i<Class_name.length; i++) {
			if(Class_name[i]==null) {
			Class_name[i]=class_name;
			break;
			}
		}
	}

	public String getArcademy_name() {
		return arcademy_name;
	}
	
	
}
