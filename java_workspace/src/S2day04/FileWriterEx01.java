package S2day04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) {
		// 문자 기반 스트림
		
		
		try {
			FileWriter fw = new FileWriter("test.txt");
			
			for(int i = 1; i<11; i++) {
				String data = i+"test \r\n"; // \r\n -> 줄바꾸고 커서 맨앞으로
				fw.write(data);
			}
			
			fw.close();
			
			// filename , option(append 옵션 true/false) 
			FileWriter fw1 = new FileWriter("test.txt",true);
			
			for(int i = 11; i<21; i++) {
				String data = i+"test \r\n"; // \r\n -> 줄바꾸고 커서 맨앞으로
				fw1.write(data);
			}
			
			fw1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
