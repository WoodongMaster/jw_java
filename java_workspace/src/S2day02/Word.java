package S2day02;

import java.util.Objects;

public class Word implements Comparable <Word> {
	private String word;
	private String mean;
	
	public Word() {
	}
	
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}

	public int compareTo(Word word) {
	    return this.word.compareTo(word.word);
	   }
	
	@Override
	public String toString() {
		return "단어 : "+word+" , 의미 : "+mean;
	}
	
}

