package ch03.course03;

public class VIPCustomer extends Customer {

	private String agentID;			// 담당전문상담원ID
	double salesRatio;
	
	// 상위클래스에서 별도생성자를 만든 경우, 하위클래스에서는 상위클래스의 생성자를 명시적으로 호출해야 함 <=> 에러 발생
	// 상위클래스가 Customer(String, String) 이므로, 하위클래스도 동일하게 맞춰주는 방식을 많이 사용함
	/*
	public VIPCustomer() {
		super(null, null);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;			// 5% 보너스 포인트
		salesRatio = 0.1;			// 10% 할인율
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/

	public VIPCustomer(String customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;			// 5% 보너스 포인트
		salesRatio = 0.1;			// 10% 할인율
		
		System.out.println("VIPCustomer(String, String) 생성자 호출");
	}
	
	
	// getter, setter 구현

	public String getAgentID () {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}

