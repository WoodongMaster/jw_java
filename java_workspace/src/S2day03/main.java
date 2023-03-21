package S2day03;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<>();
		std.add(new Student("박",90));
		std.add(new Student("이",84));
		std.add(new Student("김",77));
		std.add(new Student("엄",50));
		std.add(new Student("황",30));
		
		std.stream().forEach(s->{
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "의 점수 : "+score);
		});
		
		// std.getScore를 map으로 추출 하면 Integer 형태이므로 mapToInt를 통해 추출해서 int형으로..
		
		int sum = std.stream().mapToInt(n->n.getScore()).sum();
		
		int count = (int)std.stream().count();
		
		System.out.println("점수 합계 : "+sum);
		System.out.println("학생 수 : "+count);
		
		int sum70 = std.stream().mapToInt(n->n.getScore()).filter(n->n>=70)
		.sum();
		
		System.out.println("70점 이상인 학생들의 합계 : "+sum70);
		
		
		
		
		}
			
	}

