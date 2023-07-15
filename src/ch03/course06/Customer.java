package ch03.course06;

public class Customer {
	protected String customerID;		// 고객 아이디
	protected String customerName;		// 고객 이름
		
	protected String customerGrade;		// 고객 등급
	int bonusPoint;						// 보너스 포인트
	double bonusRatio;					// 보너스 포인트 적립비율
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;				// 1% 보너스 포인트
		
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(String customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;				// 1% 보너스 포인트
		
		System.out.println("Customer(String, String) 생성자 호출");
	}
	
	// getter, setter 구현

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
	
	/**
	 * 상품가격 반환
	 * 
	 * @param price 상품가격
	 * @return price 상품가격
	 */	
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	/**
	 * 고객정보(고객 이름, 고객 등급, 보너스포인트) 반환 
	 * 
	 * @return result
	 */	
	public String showCustomerInfo () {
		String result = "";
		result = customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
		return result;
	}
}
