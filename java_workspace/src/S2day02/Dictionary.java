package S2day02;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Dictionary {
	private ArrayList<Word> wd = new ArrayList<>();

	public Dictionary() throws IOException {
		wd.add(new Word("apple","사과"));
		wd.add(new Word("banana","바나나"));
		wd.add(new Word("air","공기"));
		wd.add(new Word("car","자동차"));
		wd.add(new Word("boat","배"));
		
	}
	
	
	public void word_insert(Scanner scan) {
		System.out.println("====단어 추가 페이지====");
		System.out.print("단어 : ");
		String word = scan.next();
		System.out.print("의미 : ");
		String mean = scan.next();

		wd.add(new Word(word, mean));
		
		
	}

	public void word_print() {
		Collections.sort(wd);
		
		for(int i = 0; i<wd.size(); i++) {
			System.out.println(wd.get(i));
		}

		if(wd.size()==0) {
			System.out.println("저장된 단어가 없습니다.");
		}
	}


	public void word_search(Scanner scan) {
		int index = -1;
		System.out.println("====단어 탐색 페이지====");
		System.out.print("검색할 단어를 입력해주세요 : ");
		String word = scan.next();

		for(int i = 0; i<wd.size(); i++) {
			if(wd.get(i).getWord().equals(word)) {
				index = i;
				System.out.println("---- 검색결과 ----");
				System.out.println("검색한 단어 : "+ word);
				System.out.println("의미 : "+wd.get(i).getMean());
			}
		}
		if(index == -1) {
			System.out.println("검색한 단어가 없습니다.");
			return;
		}
	}

	public void word_update(Scanner scan) {
		int index = -1;
		System.out.println("====단어 수정 페이지====");
		System.out.print("수정을 원하는 단어를 입력해주세요 : ");
		String word = scan.next();
		
		for(int i = 0; i<wd.size(); i++) {
			if(word.equals(wd.get(i).getWord())) {
				index = i;
				System.out.print("바꿀 단어 : ");
				String chgword = scan.next();
				System.out.print("바꿀 의미 : ");
				String chgmean = scan.next();
				
				wd.get(i).setMean(chgmean);
				wd.get(i).setWord(chgword);

			}
		}

		if(index == -1) {
			System.out.println("입력한 단어가 없습니다.");
			return;
		}
	
	}
	public void word_delete(Scanner scan) {
		int index = -1;
		System.out.println("====단어 삭제 페이지====");
		System.out.print("삭제할 단어를 입력해주세요 : ");
		String word = scan.next();

		for(int i = 0; i<wd.size(); i++) {
			if(word.equals(wd.get(i).getWord())) {
				index = i;
				wd.remove(i);
				System.out.println("삭제완료");
			}
		}
		if(index == -1) {
			System.out.println("입력한 단어가 없습니다.");
			return;
		}
	}
	
	public void word_filesave() throws IOException{
		FileWriter fw = new FileWriter("단어장.txt");
		BufferedWriter bw = new BufferedWriter(fw);  // 성능용 buffer + fileWriter
		
		StringBuffer sb = new StringBuffer();
		String data = null;
		sb.append("단어장");
		sb.append("\r\n");
		
		Collections.sort(wd);
		for(int i = 0; i<wd.size(); i++) {
			sb.append(wd.get(i));
			sb.append("\r\n");	
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		System.out.println("파일 저장 완료");
		bw.close();
		fw.close();
	}
	
	public void word_fileopen() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("단어장.txt"));
		while(true) {
			
			String line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
	}

}
	
