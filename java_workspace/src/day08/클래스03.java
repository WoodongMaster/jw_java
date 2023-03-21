package day08;

public class 클래스03 {

	public static void main(String[] args) {
		Card c = new Card();
		System.out.print(c.getSymbol());
		System.out.println(c.getNumber());
		
		c.setNumber(12);
		c.setSymbol('◆');
		
		System.out.print(c.getSymbol());
		System.out.println(c.getNumber());
		
		c.Print();
		
		c.setNumber(22);
		c.setSymbol('!');
		c.Print();
	}

}

class Card{
	private char symbol;
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
			System.out.println(("카드 : ")+symbol+"J");
			break;
		case 12:
			System.out.println(("카드 : ")+symbol+"Q");
			break;
		case 13:
			System.out.println(("카드 : ")+symbol+"K");
			break;
		default :
			System.out.println(("카드 : ")+symbol+number);
			break;
		}
		
	}
	
	public char getSymbol() {
		return symbol;
	}
	
	public void setSymbol(char symbol) {
		if(symbol == '♥' || symbol == '♠' || symbol == '♣' || symbol == '◆') {
			this.symbol = symbol;
		}
		else {
			this.symbol = '♥';
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
