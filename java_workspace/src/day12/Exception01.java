package day12;

public class Exception01 {

	public static void main(String[] args) {
		/* 예외처리
		 * try ~ catch ~ finally
		 * try안에 예외가 발생할 가능성이 있는 구문 작성
		 * catch안에 try구문에서 예외가 발생했을 때 예외처리
		 * finally try 구문외 반드시 실행되야하는 구문이 있을경우 사용(없으면 사용안해도 딤)
		*/
		
		double res = 0;
		
		int num = 10;
		int num1 = 0;
		
		try{
			int sum = num1+num;
			System.out.println(sum);
			res = num/num1;
			
		}
		catch(Exception e) {
			System.out.println("0으로 나누었습니다. Exception 발생");
		}
		finally {
			System.out.println("꼭 처리되어야 하는 구문");
		}
		
	}

}
