package S2day03;

public class Customer implements Comparable <Customer>{

	private String name;
	private int age;
	private int cost;
	
	public Customer() {}
	
	public Customer(String name, int age) {
		this.name=name;
		this.age=age;
		if(age >= 15) {
			cost = 100;
		}
		else {
			cost = 50;
		}
	}

	@Override
	   public int compareTo(Customer customer) {
	      return this.name.compareTo(customer.name);
	   }
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", cost=" + cost + "]";
	}
	
	
	
}
