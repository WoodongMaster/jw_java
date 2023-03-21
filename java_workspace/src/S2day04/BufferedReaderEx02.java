package S2day04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEx02 {

	public static void main(String[] args) throws IOException {
		// BufferedReader, PrintWriter
		// 파일을 읽어들여 복사하여 객체생성
		// out.txt에서 파일을 읽어서 out2.txt에 쓰기
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("out2.txt"));
		
		while(true) {
			String line = br.readLine(); // 한 라인씩 읽어들임
			if(line == null) {
				break;
			}
			
			pw.println(line);
			System.out.println("out2.txt에 입력됐습니다.");

		}
		
		br.close();
		pw.close();
		
	}

}