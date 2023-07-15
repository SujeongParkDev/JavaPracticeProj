package ch03.course06;

public class VIPCustomer extends Customer {

	private String agentID;			// 담당전문상담원ID
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;			// 5% 보너스 포인트
		salesRatio = 0.1;			// 10% 할인율
		
		System.out.println("VIPCustomer() 생성자 호출");
	}

	public VIPCustomer(String customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;			// 5% 보너스 포인트
		salesRatio = 0.1;			// 10% 할인율
		
		System.out.println("VIPCustomer(String, String) 생성자 호출");
	}
	
	public VIPCustomer(String customerID, String customerName, String agentID) {
		super(customerID, customerName);
		
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;			// 5% 보너스 포인트
		salesRatio = 0.1;			// 10% 할인율
		
		System.out.println("VIPCustomer(String, String, String) 생성자 호출");
	}
	
	
	// getter, setter 구현

	public String getAgentID () {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	/**
	 * 할인율을 적용하여 세일된 최종상품가격 반환
	 * 
	 * @param price 상품가격
	 * @return finalPrice 최종상품가격
	 */	
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		int finalPrice = price - (int)(price * salesRatio);
		
		return finalPrice;
	}
	
	/**
	 * 고객정보(고객이름, 담당전문상담원ID) 반환 
	 * 
	 * @return result
	 */	
	public String showCustomerInfo () {
		String result = "";
		result = customerName + "님의 담당상담원 ID는 " + agentID + "입니다.";
		return result;
	}
}

