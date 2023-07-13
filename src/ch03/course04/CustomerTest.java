package ch03.course04;

public class CustomerTest {

	public static void main(String[] args) {
		// Customer 생성
		Customer customerLee = new Customer("10010", "이순신");
		
		customerLee.bonusPoint = 1200;		// 기존 보유 보너스포인트
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.calcPrice(10000));
		
		// VIPCustomer 생성
		VIPCustomer customerKim = new VIPCustomer("10020", "김유신");
		
		customerKim.bonusPoint = 12000;		// 기존 보유 보너스포인트
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerKim.calcPrice(10000));
	}

}
