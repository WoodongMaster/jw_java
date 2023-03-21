package S2day03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class Word{
	private Map<String, ArrayList<String>> words = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	private String word;

	

	
	public void makeWord() {
		ArrayList<String> tmp = new ArrayList<>();
		System.out.println("입력할 단어 : ");
		String word = scan.next();
		Iterator<String> it = words.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			if(word.equals(key)) {
				System.out.println("이미 등록된 단어입니다.");
				System.out.println("의미를 추가하시겠습니까?");
				String sw = scan.next();
				if(sw.equals("y") || sw.equals("y")) {
					System.out.println("단어의 의미 : ");
					String mean = scan.next();
					tmp = words.get(key);
					tmp.add(mean);
					words.put(word,tmp);
					return;
				}
				else {
					return;
				}
			}
		}
		
		System.out.println("단어의 의미 : ");
		String mean = scan.next();
		tmp.add(mean);
		
		words.put(word, tmp);
		
	}
	
	public void wordPrint() {
		for(String tmp : words.keySet()) {
			System.out.println(tmp+":"+words.get(tmp));
		}
	}
	
}