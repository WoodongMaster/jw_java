package day05;

public class string01 {

	public static void main(String[] args) {
		// String str = new String();
		// String str = "가나다";
		String str = "Hello World";
		System.out.println(str);
		
		System.out.println("---charAt---");
		System.out.println(str.charAt(0));

		System.out.println("---length---");
		System.out.println(str.length());
		
		System.out.println("---compareTo---"); // str 문자열과 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		System.out.println("b".compareTo("g")); // "대상".compareTo("비교대상")
		
		System.out.println("---concat(str)---"); // 이어붙히기 (+ 연산자와 같은 의미)
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		System.out.println("---equals(str)---"); // 두 문자열이 같은지 확인 (대소문자 구분) T/F
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		
		System.out.println("---indexOf(str)---"); // 문자의 위치를 찾아주는 기능 (없으면 -1) , 중복시 처음 발견된 숫자 기준으로 출력
		System.out.println("abc".indexOf("c"));
		
		System.out.println("---lastIndexOf(str)---"); // 뒤에서부터 탐색
		System.out.println("abcdea".lastIndexOf("a"));
		
		String email = "kimhongdong@gg";
		System.out.println(email.indexOf("o"));
		
		System.out.println("---substring---"); // 문자열 추출 substring 인덱스 번호부터 끝까지 추출
		System.out.println(email.substring(0,5)); // str.substring(시작 인덱스 위치, 개수);
		System.out.println(email.substring(0, email.indexOf("@"))); // substring 과 indexOf 조합
		
		System.out.println(email.substring(email.indexOf("@")+1, email.length()));  
		
		System.out.println("---trim---"); // 불필요한 공백 삭제
		System.out.println("          HELLO hello          ".trim());
		
		System.out.println("---replace---"); // 글자 치환
		System.out.println("Hello World".replace("World", "JAVA"));
		
		System.out.println("---split---"); // 특정 값을 기준으로 나누기
		String str1 = "dog, cat, tiger";
		String[] arr = str1.split(",");
		for(String tmp : arr){
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		String num1 = "1";
		String num2 = "2";
		String sum = num1+num2;
		System.out.println(sum);
		
		System.out.println("---parseInt---"); // 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		int sum1= num3+num4;
		System.out.println(sum1);
		}
	}

