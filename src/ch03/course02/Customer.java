package ch03.course02;

public class Customer {
	protected String customerID;		// 고객 아이디
	protected String customerName;		// 고객 이름
	
//	상위 클래스에서 선언된  private 멤버 변수는 하위 클래스에서 접근할 수 없음
//	외부 클래스는 접근할 수 없지만 하위 클래스는 접근할 수 있도록 protected 접근 제어자를 사용
//	private String customerGrade;		// 에러 => private 접근제어자로 VIPCustomer 에서 사용불가
	
	protected String customerGrade;		// 고객 등급
	int bonusPoint;						// 보너스 포인트
	double bonusRatio;					// 보너스 포인트 적립비율
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;				// 1% 보너스 포인트
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
	 * 보너스 포인트(상품가격*보너스 포인트 적립비율) 반환
	 * 
	 * @param price 상품가격
	 * @return bonusPoint 보너스 포인트
	 */	
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return bonusPoint;
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
