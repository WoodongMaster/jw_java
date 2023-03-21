package day09;

public class CardPack {

		/* CardPack 클래스
		 * 카드팩 = 52장의 카드들
		 * 1. 카드 셔플 기능
		 * 2. 드로우 기능
		 * 3. 카드 초기화 기능
		 * 4. 출력기능 - 카드 클래스에서 가져옴
		 * 
		 * 생성자 - 52장의 카드를 모두 생성
		 * 
		 */
	
		private Card[] pack = new Card[52];
		private int cnt = 0;
		
		public CardPack() {
				for(int i=1; i<=4; i++){
					for(int j=1; j<=13; j++) {
					Card c = new Card(); // 카드 1장 생성
					c.setSymbol(i);
					c.setNumber(j);
					pack[cnt] = c;
					cnt++;
				}
			}
		}
	
		
		public void Shuffle(){
			int min =0;
			int max =pack.length-1;
			for(int i = 0; i<pack.length;i++) {
				int random = (int)(Math.random()*(max-min+1))+min;
				Card tp = pack[i];
				pack[i]=pack[random];
				pack[random]=tp;
			}	
		}
		
		public Card pick() {
			if(cnt>0) {
				cnt--;
				return pack[cnt]; 
			}
			else {
				System.out.println("카드가 없습니다.");
				return null;
			}
		}
		
		public void init() {  // 카드 기본상태로 초기화
			cnt = 52;
		}
		
	}


