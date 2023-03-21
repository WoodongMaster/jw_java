package day11;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customerlist[] = new Customer[10];
		
		Customer c = new Customer("ccc","홍길동"); // 업캐스팅
		Customer g = new Gold("ggg","박흥신"); // 업캐스팅
		Customer v = new Vip("vvv","이학"); // 업캐스팅
		
		System.out.println(v instanceof Customer); // 부모클래스 찾았으니 true
		System.out.println(v instanceof Vip); // 자기집 찾았으니 true
		System.out.println(v instanceof Gold); // 누구세요? false
		
		Vip vcustomer = (Vip)v;  // 다운캐스팅 -> instanceof 로 형변환 가능한지
		System.out.println(vcustomer.getCounselor());
		
		System.out.println("----고객 정보 출력----");
		int cnt = 0;
		customerlist[cnt]=c;
		cnt++;
		customerlist[cnt]=g;
		cnt++;
		customerlist[cnt]=v;
		cnt++;
		
		for(int i=0; i<cnt; i++) {
			customerlist[i].customerInfo();
		}
		
		System.out.println("----고객 할인율과 포인트 계산----");
		int price = 10000;
		for(int i=0; i<cnt; i++) {
			System.out.println(customerlist[i].getCustomerName()+"의 지불 금액 : "+customerlist[i].calPrice(price));
			customerlist[i].customerInfo();
		}
	}

}
