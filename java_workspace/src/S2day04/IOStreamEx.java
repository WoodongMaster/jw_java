package S2day04;

import java.io.IOException;

public class IOStreamEx {

	public static void main(String[] args) {
		/*
		 * Input Output Stream : IOStream
		 * 스트림 : 단방향으로 데이터가 흘러가는 형태
		 * 다양한 장치에 독립적으로 일관성있는 입출력을 유지하기위해 입출력스트림을 통해 일관성을 제공
		 * 
		 * 두가지 형태의 스트림 구분 
		 * - 바이트 형태의 스트림 : 기본 (문자, 그림, 멀티미디어) 
		 * - 문자 형태의 스트림 : 문자를 입출력할 때 사용
		 * 
		 * ㅇ 바이트 스트림
		 * -입력 : InputStream -> fileInputStream, BufferedInputStream, DataInputStream...
		 * -출력 : OutputStream -> fileOutputStream. PrintStream, BufferedOutputStream...
		 * 
		 * ㅇ 문자 스트림
		 * -입력 : Reader ->  FileReader, BufferedReader, InputStreamReader...
		 * -출력 : Writer -> FileWriter, PrintWriter, BufferedWriter ...
		 * 
		 *  기반스트림 / 보조스트림
		 *  기반스트림 : 대상에서 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 *  보조스트림 : 직접 읽고 쓰는 기능은 없지만 추가적인 기능을 더해주는 스트림
		 *  
		 *  기반스트림 ex) fileInputStream, fileOutputStream, FileReader, FileWriter ...
		 *  보조스트림 ex) InputStreamReader, Buffered계열...
		 *  
		 *  기반스트림에 보조스트림을 더해서 데이터를 입출력
		 */
		
		System.out.println(); // 표준 출력(모니터) 스트림
		
		try {
			System.in.read(); // 표준 입력(키보드) 스트림 (1바이트만 입력받음)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.err.println(); // 펴준 에러 출력(모니터) 스트림
	}

}
