package ch03.course03;

public class CustomerTest {

	public static void main(String[] args) {
		// Customer 생성
		Customer customerLee = new Customer("10010", "이순신");
		
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID("10010");
		customerLee.bonusPoint = 1200;		// 기존 보유 보너스포인트
		System.out.println(customerLee.showCustomerInfo());
		
		// VIPCustomer 생성
		VIPCustomer customerKim = new VIPCustomer("10020", "김유신");
		
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerID("10020");
		customerKim.bonusPoint = 12000;		// 기존 보유 보너스포인트
		System.out.println(customerKim.showCustomerInfo());
	}

}
