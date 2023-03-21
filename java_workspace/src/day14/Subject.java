package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Subject {

	Scanner scan = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap();

	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		subject.menu();
		
	}

	public void menu() {
		int menu=0;
		while(menu!=6) {
		System.out.println("=========MENU=========");
		System.out.println("1. 성적추가");
		System.out.println("2. 성적조회(전체)");
		System.out.println("3. 성적조회(과목)");
		System.out.println("4. 성적수정");
		System.out.println("5. 성적삭제");
		System.out.println("6. 종료");
		
		menu = scan.nextInt();
		 
		switch(menu) {
			case 1:
				subject_Input(map);
				break;
			case 2:
				subject_Print();
				break;
			case 3:
				subject_Search();
				break;
			case 4:
				subject_fix();
				break;
			case 5:
				subject_remove();
				break;
			case 6:
				break;
			default :
				System.out.println("잘못된 번호입니다.");
			}
		}
	}
	
	public void subject_Input(HashMap<String, Integer> map) {
		System.out.println("성적을 입력해주세요! (과목,점수)");
		String sub = scan.next();
		int num = scan.nextInt();
		
		if(num <0 || num>100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		
		if(map.get(sub)==null) {
			map.put(sub, num);
		}
		else {
			System.out.println(sub+"는 이미 존재합니다.");
		}
		
	}
	
	public void subject_Print() {
		int sum=0;
		double avg=0;
		Iterator<String> it = map.keySet().iterator();
		
	    while(it.hasNext()) {
	  	  String sub = it.next();
	  	  int num = map.get(sub);
	  	  System.out.println("과목 : "+sub+" 점수 : "+num+"점");
	  	  sum += num;
	  	  
	      }
	    
	    System.out.println("합계 : "+sum+", 평균 : "+sum/map.size());
	}
	
	public void subject_Search() {
		System.out.println("보기원하는 과목을 입력해주세요!");
		String sub = scan.next();
		int num = map.get(sub);
		if(sub == null) {
			System.out.println(sub+"는 없는 과목입니다.");
		}else {
			System.out.println(sub+":"+num+"점");
		}
	}
	
	public void subject_fix() {
		System.out.println("수정을 원하는 과목과 점수를 입력해주세요!");
		String sub = scan.next();
		int num = scan.nextInt();
		
		if(num <0 || num>100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		
		map.put(sub, num);// sub중복되면 덮어쓰기 , 리스트라면 지우고 채워야함
		System.out.println(sub+" 성적이 "+num+"으로 변경되었습니다.");
	}
	
	public void subject_remove() {
		System.out.println("삭제할 과목을 입력해주세요!");
		String sub = scan.next();
		if(map.get(sub)==null) {
			System.out.println(sub+"는 없는 과목입니다.");
		}else {
			map.remove(sub);
			System.out.println(sub+"가 삭제되었습니다.");
		}
	}
	
	
}
