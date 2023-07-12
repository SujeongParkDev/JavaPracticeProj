package ch02.course08;

public class OrderInfo {

	protected String orderId;				// 유일한 식별자가 되어야 함
	protected String clientPhoneNumber;
	protected String clientAddress;
	protected String orderDate;
	protected String orderTime;
	protected int orderPrice;
	protected String menuNumber;
	
	public OrderInfo() {
		
	}
	
	public OrderInfo(String clientPhoneNumber, String clientAddress,
					 String orderDate, String orderTime, int orderPrice, String menuNumber) {
		this.orderId = orderDate + menuNumber;
		this.clientPhoneNumber = clientPhoneNumber;
		this.clientAddress = clientAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNumber = menuNumber;
	}
	
	/**
	 * 주문정보(주문접수번호, 주문핸드폰번호, 주문집주소, 주문날짜, 주문시간, 주문가격, 메뉴번호) 출력 
	 */	
	public void showOrderInfo () {
		System.out.println("주문 접수 번호 : " + orderId);
		System.out.println("주문 핸드폰 번호 : " + clientPhoneNumber);
		System.out.println("주문 집 주소 : " + clientAddress);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("메뉴 번호 : " + menuNumber);
	}
	
	
}
