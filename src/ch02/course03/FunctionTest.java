package ch02.course03;

public class FunctionTest {

	/**
	 * 매개변수의 합 반환 
	 * 
	 * @param num1 숫자1
	 * @param num2 숫자2
	 * @return result num1과 num2의 합
	 */	
	private static int addNum (int num1, int num2) {
		int result; 
		// 지역변수 result 가 사용하는 메모리 = 스택
		result = num1 + num2;
		
		return result;
	}
	
	/**
	 * 매개변수 출력 
	 * 
	 * @param greeting 문자
	 */	
	private static void sayHello (String greeting) {
		System.out.println(greeting);
	}
	

	/**
	 * 1부터 100까지의 합 반환
	 * 
	 *  @return sum 1부터 100까지의 합
	 */
	private static int calcSum () {
		int sum = 0;
		int i;
		
		// 1~100 까지의 합
		for(i = 0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}	
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		// main 메소드의 지역변수 n1, n2 가 스택에 쌓임
		
		int total = addNum(n1, n2);
		// addNum 메소드의 지역변수가 스택에 쌓이고, 수행완료 시 메모리 반환됨
		
		sayHello("안녕하세요");
		
		int num = calcSum(); 
		
		System.out.println(total);
		System.out.println(num);
	}
}
