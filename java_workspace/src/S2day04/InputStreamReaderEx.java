package S2day04;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		// 한글 여러글자를 읽고 출력
		
		System.out.println("한글로 입력해주세요 (Enter)");
		int i;
		
		// InputStreamReader (보조스트림이어서 기반스트림인 System.in 사용)
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			
			while((i= isr.read()) != '\n') {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
