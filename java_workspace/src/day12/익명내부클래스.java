package day12;

public class 익명내부클래스 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runner = outer.getRunnable(10);
		runner.run();

	}

}

class Outer{
	int outNum = 10;
	static int sNum = 20;
	
	Runnable getRunnable(int i) {
		int num = 100;
	
	
	
	class MyRunnable implements Runnable{
		int localNum = 1000;
		
		@Override
		public void run() {
				System.out.println("매개변수 i="+i);
				System.out.println("메서드 안 num="+num);
				System.out.println("내부클래스 안 localNum"+localNum);
				System.out.println("외부클래스 안 outNum"+outNum);
				System.out.println("외부클래스 static sNum="+sNum);
			}
				
		}
	return new MyRunnable();
	}
}