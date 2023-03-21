package day02;
import java.util.Scanner;
public class 지뢰찾기 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt(), M=in.nextInt(), i, j, ii, jj, n;
    char[][] boardC=new char[N][M]; //N,M 입력받아서 char boardC[N][M]을 만듦
    String[] boardS=new String[N];
    for(i=0;i<N;i++){ //입력
       boardS[i]=in.next(); //boardS[N]으로 String으로 입력받음
       for(j=0;j<M;j++) boardC[i][j]=boardS[i].charAt(j); //한글자씩 boardC[N][M]에 집어넣음
    }
    for(i=0;i<N;i++){ //연산 및 출력 함께
       for(j=0;j<M;j++)
       switch(boardC[i][j]){
       case '*' :
           System.out.print(boardC[i][j]); break;
       default :
           for(n=0, ii=(i>0)?i-1:0; ii<=i+1 && ii<=N-1; ii++)
               for( jj=(j>0)?j-1:0; jj<=j+1 && jj<=M-1; jj++)
                   if(boardC[ii][jj]=='*') n++; //동서남북대각선 8개칸에서 지뢰 세기
           System.out.print(n); break;
       }
       System.out.println();
    }
 }}