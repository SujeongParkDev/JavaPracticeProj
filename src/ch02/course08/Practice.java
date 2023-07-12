package ch02.course08;

public class Practice {

	public static void main(String[] args) {

		// 1.
		PersonInfo personInfo = new PersonInfo("Tomas", 37, 180, 78, "남성");
		System.out.println(personInfo.showPersonInfo());
		
		// 2.
		OrderInfo orderInfo = new OrderInfo("01023450001", "서울시 강남구 역삼동 111-333",
											"20201102", "130258", 35000, "0003");
		orderInfo.showOrderInfo();
	}

}
