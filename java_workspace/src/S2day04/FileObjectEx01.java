package S2day04;

import java.io.File;
import java.util.StringTokenizer;

public class FileObjectEx01 {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보를 출력.
		// D:\_java_workspace\java_workspace\out.txt
		File f = new File("D:\\_java_workspace\\java_workspace\\out.txt");
		
		String fileName = f.getName(); // 경로제외 파일이름
		System.out.println(fileName); 
		System.out.println(f.getPath()); // 경로+이름
		System.out.println(f.getAbsolutePath()); // 경로+이름
		System.out.println(f.getParent()); // 경로
		System.out.println(File.separator); // 파일 구분자 (가장 많이 사용)
		System.out.println(File.separatorChar);
		
		//시스템에서 직접 알아낸 사용자파일의 경로는 분리
		
		System.out.println();
		String fstr = f.toString(); // 경로+파일명
		System.out.println(fstr);
		System.out.println("저장 드라이브 : "+fstr.substring(0,fstr.indexOf(File.separator)-1)); // 저장 드라이브만
		System.out.println("파일명 : "+fstr.substring(fstr.lastIndexOf(File.separator)+1)); // 파일명만
		System.out.println("경로 : "+fstr.substring(fstr.indexOf(File.separator)+1,fstr.lastIndexOf(File.separator))); // 경로만
		
		//파일명과 확장자 분리 방법 1 : split(File.separator+".")
		System.out.println("==파일명 확장자 분리 (Split)==");
		System.out.println(f.getName());
		String[] str = f.getName().split(File.separator+".");
		System.out.println("파일명 : "+str[0]+" 확장자 : "+str[1]);
		
		//파일명과 확장자 분리 방법 2 : StringTokenizer 클래스
		System.out.println("==파일명 확장자 분리 (StringTokenizer)==");
		StringTokenizer stk = new StringTokenizer(f.getName(),".");
		while(stk.hasMoreElements()) {
			System.out.println(stk.nextElement());
		}
		

	}

}
