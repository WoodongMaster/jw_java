package S2day04;

import java.io.IOException;

public class SystemInEx01 {

	public static void main(String[] args) {
		
		System.out.println("알파벳을 하나 쓰고 Enter : ");
		int j;
		try {
			
			j= System.in.read();
			//System.out.println(i);
			System.out.println((char)j);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("알파벳 여러개 쓰고 Enter : "); // while
		int i;
		try {
			while((i = System.in.read()) !='\n') {
				
				//System.out.println(i);
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
