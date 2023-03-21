package S2day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx01 {

	public static void main(String[] args) throws IOException {
		// FileInputStream : 바이트 단위 기반 스트림
		byte [] b = new byte[1024];
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b);
		
		String data = new String(b); // byte 배열을 문자열로 변경하여 출력

		System.out.println(data);
		System.out.println(new String(b));
		input.close();
	}

}