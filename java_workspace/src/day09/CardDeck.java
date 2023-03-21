package day09;

public class CardDeck {

	public static void main(String[] args) {
		
		Card c = new Card();
		CardPack p = new CardPack();
		
		
		for(int i =1 ; i<53; i++) {
				
			Card tmp = p.pick();
			tmp.Print();	
					
					if(i%13==0) {
						System.out.println();
					}
			}
		
		System.out.println();
		
		p.init();
		p.Shuffle();
	
		for(int i =1 ; i<53; i++) {
			
			Card tmp = p.pick();
			tmp.Print();	
					
					if(i%13==0) {
						System.out.println();
					}
			}
		System.out.println();
		p.pick();
		p.pick();
		p.pick();
		p.pick();
		}
		
		
		
	}
	/*
	 * card 클래스 52개 객체 , 중복카드 x 52장 리스트업 , 52장 섞고 한장 뽑기
	 */

class Card{
	char symbol;
	private int number;
	/*
	 * 모양 : ♥♠♣◆ 숫자 : 1~10 j(11) q(12) k(13)
	 */
	public Card(){
		symbol = '♥'; 
		number = 1;
	}
	
	public Card(char symbor, int number){
		this.symbol = symbol;
		this.number = number;
	}
	
	
	
	public void Draw() {
		System.out.println("카드 뽑음");
		int r_symbol = (int) (Math.random() * 4 + 1);
		int r_number = (int) (Math.random() * 13 + 1);
		switch(r_symbol) {
		case 1:
			symbol = '♥';
			break;
		case 2:
			symbol = '♠';
			break;
		case 3:
			symbol = '♣';
			break;
		case 4:
			symbol = '◆';
			break;
		default:
			break;
		}
		number = r_number;
	}
	

	public void Print() {
		switch(number) {
		case 11:
			System.out.print(symbol+"J"+" ");
			break;
		case 12:
			System.out.print(symbol+"Q"+" ");
			break;
		case 13:
			System.out.print(symbol+"K"+" ");
			break;
		default :
			System.out.print(symbol+""+number+" ");
			break;
		}
		
	}
	
	public char getSymbol() {
		return symbol;
	}
	
	public void setSymbol(int a) {
		switch(a) {
		case 0:
			symbol = '♥';	
			break;
		case 1:
			symbol = '♠';	
			break;
		case 2:
			symbol = '♣';	
			break;
		case 3:
			symbol = '◆';	
			break;
		default :
			break;
		}
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		if(number < 1 || number > 13) {
			this.number = 1;
		}
		else {
			this.number = number;
		}
	}
	
	
}




