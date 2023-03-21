package S2day02;

// 제네릭 : 결정되지 않은 파라미터를 처리할때
// 실제 객체를 사용할 때 파라미터 타입 결정을 대체
// <T> <K> <V>
// menu, price

public class Sale <K,V> {
	private K menu;
	private V price;
	
	public Sale() {
		
	}
	
	public Sale(K menu, V price) {
	 this.menu = menu;
	 this.price = price;
	 
	}

	public K getMenu() {
		return menu;
	}

	public void setMenu(K menu) {
		this.menu = menu;
	}

	public V getPrice() {
		return price;
	}

	public void setPrice(V price) {
		this.price = price;
	}
	
	
}

