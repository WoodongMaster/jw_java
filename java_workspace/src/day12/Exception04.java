package day12;

public class Exception04 {

	public static void main(String[] args) {
		/*
		 * try{
		 * 
		 * }catch(예외클래스명 객체){
		 * 처리문;
		 * }catch(예외클래스명2 객체){
		 * 처리문;
		 * }catch(예외클래스명3 객체){
		 * 처리문;
		 * }
		 */
		
		double res = 0;
		
		try {
//			res=1/0;
//			int arr[] = null;
			int arr[] = new int[2];
			arr[3]=10;
		}catch (ArithmeticException | NullPointerException e){
			System.out.println("Arith , NullPo 오류 발생");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Index 오류 발생");
		}catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("종료");
	}

}
