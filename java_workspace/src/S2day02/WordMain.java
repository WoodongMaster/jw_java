package S2day02;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        Dictionary dc = new Dictionary();
        int sc = -1;
       
        do {
            
            System.out.println("==== 단어장 프로그램 ====");
            System.out.println("1. 단어추가");
            System.out.println("2. 단어출력");
            System.out.println("3. 단어검색");
            System.out.println("4. 단어수정");
            System.out.println("5. 단어삭제");
            System.out.println("6. 파일저장");
            System.out.println("7. 파일열기");
            System.out.println("0. 종료");
        
            sc = scan.nextInt();
            switch(sc) {
            case 1 :
                dc.word_insert(scan);
                break;
            case 2 :
                dc.word_print();
                break;
            case 3 :
                dc.word_search(scan);
                break;
            case 4 :
                dc.word_update(scan);
                break;
            case 5 :
                dc.word_delete(scan);
                break;
            case 6 :
            	dc.word_filesave();
            	break;
            case 7 :
            	dc.word_fileopen();
            	break;
            case 0 :
                System.out.println("프로그램 종료!");
                break;
                default :
                    System.out.println("잘못된 숫자입니다.");
                    break;
            }
            
        }while(sc != 0);
        
        scan.close();
    }

}