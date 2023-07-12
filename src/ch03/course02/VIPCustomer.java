package ch03.course02;

public class VIPCustomer extends Customer {
	private String agentID;			// 담당전문상담원ID
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;			// 5% 보너스 포인트
		salesRatio = 0.1;			// 10% 할인율
	}
	
	// getter, setter 구현
	
	
	/**
	 * 담당전문상담원ID 반환 
	 * 
	 * @return agentID
	 */	
	public String getAgentID () {
		return agentID;
	}
}
