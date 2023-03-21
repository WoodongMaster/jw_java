package S2day05;

public class ThreadEx02 {

	public void main(String[] args) {
		/* Runnable을 구현하는 방법
		 * 
		*/	
		
		MyThread2 mth = new MyThread2();
		Thread th1 = new Thread(mth);
		th1.start();
		
		try {
			th1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		
		try {
			th2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end~");
		
		}

}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<200; i++) {
			System.out.println(i+"번째"+Thread.currentThread().getName());
		}
	}
	
}