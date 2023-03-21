package day01;

import java.util.Scanner;

public class IF문3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int math,kor,eng;
	
	while(true) {
	System.out.println("국어 점수를 입력해주세요. (0~100)");
	kor = scan.nextInt();
	if(kor > 100 || kor < 0) 
	{
	System.out.println("잘못된 점수입니다.");
	}
	else
	break;
	}

	while(true) {
	System.out.println("영어 점수를 입력해주세요. (0~100)");
	eng = scan.nextInt();
	if(eng > 100 || eng < 0) 
	{
	System.out.println("잘못된 점수입니다.");
	}
	else
	break;
	}

	while(true) {
	System.out.println("수학 점수를 입력해주세요. (0~100)");
	math = scan.nextInt();
	if(math > 100 || math < 0) 
	{
	System.out.println("잘못된 점수입니다.");
	}
	else
	break;
	}

	int sum = kor+eng+math;
	double avg = (double)sum/3;

	System.out.println("세 과목 합계 : " + sum);
	System.out.printf("세 과목 평균 : %.2f\n", avg);

	if(avg >= 80) {
	System.out.println("과목 평가 : A");
	}
	else if(avg < 80 && avg >= 70) {
	System.out.println("과목 평가 : B");
	}
	else if(avg < 70 && avg >= 60) {
	System.out.println("과목 평가 : C");
	}
	else if(avg < 60 && avg >= 50) {
		System.out.println("과목 평가 : D");
	}
	else {
	System.out.println("과목 평가 : F");
	}
	}
	}