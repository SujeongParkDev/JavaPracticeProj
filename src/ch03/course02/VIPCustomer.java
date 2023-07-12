package ch03.course02;

public class VIPCustomer extends Customer {
	private String agentID;			// 담당전문상담원ID
	double salesRatio;
	
	public VIPCustomer() {
		// 상속을 받은 경우, 명시적으로 상위 클래스의 생성자 호출부가 없는 경우 컴파일러가 super() 를 추가해줌.
		// 때문에 별도의 상위 클래스 생성자 호출부가 없어도, 상위 클래스의 생성자 호출이 이루어지는 것임.
//		super();
		
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

