package S2day03;

import java.util.Scanner;

public class EnglishDictionary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Word wd = new Word();
        int sc = -1;
        
        do {
            
            System.out.println("==== 단어장 프로그램 ====");
            System.out.println("1. 단어추가");
            System.out.println("2. 단어출력");
//            System.out.println("3. 단어검색");
//            System.out.println("4. 단어수정");
//            System.out.println("5. 단어삭제");
            System.out.println("0. 종료");
        
            sc = scan.nextInt();
            switch(sc) {
            case 1 :
                wd.makeWord();
                break;
            case 2 :
                wd.wordPrint();
                break;
//            case 3 :
//                dc.word_search(scan);
//                break;
//            case 4 :
//                dc.word_update(scan);
//                break;
//            case 5 :
//                dc.word_delete(scan);
//                break;
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