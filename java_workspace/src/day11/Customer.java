package day11;

public class Customer {
	protected String customerID;
	protected String customerName;
	protected String customerGrade;
	public double bonusRatio;
	public int bonusPoint;
	public double discount=1;
	
	public Customer() {}
	
	public Customer(String customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public double calPrice(int price) {
		double result=(price*discount);
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		return result;
	}
	
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	
	
}
class Gold extends Customer{
	public Gold() {}
	
	public Gold(String customerID, String customerName) {
	super(customerID,customerName);
	customerGrade = "Gold";
	bonusRatio = 0.02;
	discount = 0.9;
	}
	
	
	
	  @Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
	}

	public double calPrice(int price) { 
	  double result=(price*discount);
	  bonusPoint = (int)(price*bonusRatio)+bonusPoint;
	  return result; }
	 
}

class Vip extends Customer{
	private String counselor; 
	
	public Vip() {}
	
	public Vip(String customerID, String customerName) {
	super(customerID,customerName);
	customerGrade = "Vip";
	bonusRatio = 0.05;
	discount = 0.9;
	counselor = "홍미연 010-1234-1234";
	}
	
	  public double calPrice(int price) {
	  double result=(price*discount);
	  bonusPoint = (int)(price*bonusRatio)+bonusPoint; 
	  return result;
	  }

	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
		System.out.println("전문 상담원 이름,번호 : "+counselor);
	}

	public String getCounselor() {
		return counselor;
	}

	public void setCounselor(String counselor) {
		this.counselor = counselor;
	}
	 
	  
	  
}








