package day02;

public class switch문1 {

	public static void main(String[] args) {
		/*switch : 값을 case마다 분리해서 실행시켜주는 조건문
		 	{
		 case 값1:
		 	실행문;
		 	break;
		 case 값2:
		 	실행문;
		 	break;
		 	.
		 	.
		 	.
		 default:
			실행문;
		 	break;
		 	}
		 */
		int num = 1;
		
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 2:
			System.out.println("num은 2입니다.");
			break;
		case 3:
			System.out.println("num은 3입니다.");
			break;
		default:
			System.out.println("num은 1,2,3이 아닙니다.");
		}
	}

}
