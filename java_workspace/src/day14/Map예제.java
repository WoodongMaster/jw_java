package day14;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map예제 {
	
	private HashMap<String, String> map = new HashMap();
	Scanner scan = new Scanner(System.in);
	private int size = 5;
	
	public static void main(String[] args) {
	     //1. 저장공간을 어디에다가 둘 지 
        //-멤버변수 -> 공용변수로 있는 형태
        //-메인(비추천) 외부 메서드에서 매개변수로 담는 형태 -> 매개변수로 받는 형태
        //HashMap<String, String> map = new HashMap<String, String>();
        //-메서드 내부에 생성 -> 리턴의 형태
      //2. 매개변수와 리턴타입, 매서드명을 결정 -> Interface 생성
      //make() //불가하므로 객체를 생성해야된다.
		
      Map예제 ex = new Map예제();
//      HashMap<String, String> map1 = ex.make3();
      
      
//      ex.make();
//      Iterator<String> it = ex.map.keySet().iterator();
//      while(it.hasNext()) {
//    	  String word = (String)it.next();
//    	  String mean = ex.map.get(word);
//    	  System.out.println("단어 : "+word+" 뜻 : "+mean);
//    	  
//      HashMap<String, String> map1 = new HashMap<>();
//      ex.make2(map1);
//      
//    Iterator<String> it = map1.keySet().iterator();
//    while(it.hasNext()) {
//  	  String word = (String)it.next();
//  	  String mean = map1.get(word);
//  	  System.out.println("단어 : "+word+" 뜻 : "+mean);  
//      }
    
     ex.map=ex.make3();
      
    Iterator<String> it = ex.map.keySet().iterator();
    while(it.hasNext()) {
  	  String word = (String)it.next();
  	  String mean = ex.map.get(word);
  	  System.out.println("단어 : "+word+" 뜻 : "+mean);  
      } 
    
   }
   //메서드 자리: 리턴 타입, 매개변수, 메서드명을 결정
   //1.멤버변수로 map이 있는 형태(공용) 리턴x, 받을것도 없음
   public void make() {
      while(map.size()<size) {
    	  System.out.println("단어 : ");
    	  String word = scan.next();
    	  System.out.println("뜻 : ");
    	  String mean = scan.next();
    	  
    	  map.put(word, mean);
      }
   }
   
   //2. 외부에 map이 있는 형태 (매개변수로 amp을 가져오기)
   public void make2(HashMap<String, String> map1) {
	  while(map1.size()<size) {
 	  System.out.println("단어 : ");
 	  String word = scan.next();
 	  System.out.println("뜻 : ");
 	  String mean = scan.next();
 	  
 	  map1.put(word, mean);
   }
   }
   //3. 메서드 내부에서 map생성하는 형태(return이 map인 형태)
   public HashMap<String, String> make3() {
      HashMap<String, String> map = new HashMap<String, String>();
	  while(map.size()<size) {
	 	  System.out.println("단어 : ");
	 	  String word = scan.next();
	 	  System.out.println("뜻 : ");
	 	  String mean = scan.next();
	 	  
	 	  map.put(word, mean);
	   }
	  
      return map;
   }
}