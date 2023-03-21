package S2day04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPopupMenu.Separator;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws IOException {
		// map에 저장후 이름: 점수 총합계, 총인원 출력
		String name;
		int score;
		int sum=0;
		HashMap<String, Integer> std = new HashMap();
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		
		while(true) {
			
			String line = br.readLine();
			if(line == null) {
				break;
			}
			name = line.substring(0, line.indexOf(" "));   // substring(start, end) start <= index < end
			score = Integer.parseInt(line.substring(line.lastIndexOf(" ")+1)); // end 없으면 끝까지
			std.put(name, score);
			sum += score;
			

			
		}
		for(String tmp : std.keySet()) {
			
			System.out.print(tmp+" : "+std.get(tmp));
			System.out.println();
		}
		
		System.out.println("총 인원수 : "+std.size());
		System.out.println("점수 합 : "+ sum);

	}

}
