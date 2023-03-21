package S2day02;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEX {

	public static void main(String[] args) {
		// RegularExpression : 정규 표현식

		String[] strarr = {"bat", "baby","bamboo","car","disk","count"};
		Arrays.sort(strarr);
		for(int i = 0; i<strarr.length; i++) {
			System.out.println(strarr[i]+" ");
		}
		
		System.out.println("---------------------------------");
		
		Pattern pattern = Pattern.compile("b[a-zA-z]*");
		for(String str : strarr) {
			Matcher matcher = pattern.matcher(str);
			if(matcher.matches()) {
				System.out.println(str+" ");
			}
		}
	}

}
