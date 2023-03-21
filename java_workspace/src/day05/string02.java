package day05;

public class string02 {

	public static void main(String[] args) {
		String str = "이것이자바다.txt";
		System.out.println("파일명 : "+str.substring(0, str.indexOf(".")));
		System.out.println("확장자명 : "+str.substring(str.indexOf(".")+1, str.length()));

		System.out.println(str.contains("자바"));
	}

}
