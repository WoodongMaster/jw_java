package day02;

public class switch문3 {

	public static void main(String[] args) {
		
		int season = (int)(Math.random()*12+1);
		
		System.out.print(season+"월의 ");
		
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("계절은 봄입니다.");
		break;
		
		case 6: case 7: case 8:
			System.out.println("계절은 여름입니다.");
		break;
		
		case 9: case 10: case 11:
			System.out.println("계절은 가을입니다.");
		break;
		
		default:
			System.out.println("계절은 겨울입니다");
		break;
			}
		}
	}

