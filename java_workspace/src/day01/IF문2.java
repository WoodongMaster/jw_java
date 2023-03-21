package day01;

public class IF문2 {

	public static void main(String[] args) {
		int kor = 62;
		int eng = 80;
		int math = 82;

		int sum=kor+eng+math;
		double avg=(double)sum/3;
	
		System.out.println("국영수 합계 : "+sum);
		System.out.println("국영수 평균 : "+avg);
		if(avg>=90) {
			System.out.println("평균 "+avg+"점으로 평가 A");
		}
		else if(avg<90 && avg>=80){
			System.out.println("평균 "+avg+"점으로 평가 B");
		}
		else if(avg<80 && avg>=70){
			System.out.println("평균 "+avg+"점으로 평가 C");
		}
		else if(avg<70 && avg>=60){
			System.out.println("평균 "+avg+"점으로 평가 D");
		}
		else
			System.out.println("평균 "+avg+"점으로 평가 F");	
		
	
	}

}
