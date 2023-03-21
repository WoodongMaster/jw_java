package day10;

public class EzenComputermain {

	public static void main(String[] args) {
		EzenComputer std[] = new EzenComputer[7];
		std[0] = new EzenComputer("홍길동", "010-1111-1111", "인천");
		std[1] = new EzenComputer("이순신", "010-2222-2222", "서울");
		std[2] = new EzenComputer("강감찬", "010-3333-3333", "인천");
		std[3] = new EzenComputer("홍길동", "010-1111-4444", "서울");
		std[4] = new EzenComputer("유관순", "010-1111-5555", "부천");	
		EzenComputer ez = new EzenComputer();
		EzenComputer ez2 = new EzenComputer();

		
		  ez.setAge("22"); 
		  ez.setArcademy_region("인천"); 
		  ez.setBirth("990101");
		  ez.setClass_name("자바(6개월)"); 
		  ez.setStudent_name("홍길동");
		  ez.setPhone("010-7759-7759");
		  
		  ez.Class_in("HTML(2개월)"); 
		  ez.Class_in("C++(3개월)");
		  
		  System.out.println(); System.out.println();
		  
		  ez2.setAge("25"); 
		  ez2.setArcademy_region("강남"); 
		  ez2.setBirth("920202");
		  ez2.setClass_name("빅데이터(3개월)"); 
		  ez2.setStudent_name("김석수");
		  ez2.setPhone("010-1234-1234"); 
		  ez2.Class_in("드론 프로그래밍(5개월)");
		 
			std[5] = ez;
			std[6] = ez2;
		  
			String searchName = "홍길동";
			String searchRegion = "인천";
			
			System.out.println("홍길동의 지점정보>");
			for(int i = 0; i<std.length; i++) {
			if(std[i].getStudent_name().equals(searchName))
			{
				System.out.println("지점명 : "+std[i].getArcademy_region());
				System.out.println("전화번호 : "+std[i].getPhone());
			}
			}
			
			System.out.println();
			
			System.out.println("지점의 개인정보>");
			for(int i = 0; i<std.length; i++) {
			if(std[i].getArcademy_region() == searchRegion)
			{
				System.out.println("이름 : "+std[i].getStudent_name());
				System.out.println("전화번호 : "+std[i].getPhone());
			}
			}
		
	
	}

}