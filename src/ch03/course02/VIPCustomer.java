package ch03.course02;

public class VIPCustomer extends Customer {
	private String agentID;			// 담당전문상담원ID
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;			// 5% 보너스 포인트
		salesRatio = 0.1;			// 10% 할인율
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	// getter, setter 구현

	public String getAgentID () {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}

