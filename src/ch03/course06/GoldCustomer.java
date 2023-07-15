package ch03.course06;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.02;				// 2% 보너스 포인트
		
		System.out.println("GoldCustomer() 생성자 호출");
	}
	
	public GoldCustomer(String customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;				// 2% 보너스 포인트
		salesRatio = 0.1;			// 10% 할인율
		
		System.out.println("GoldCustomer(String, String) 생성자 호출");
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
}
