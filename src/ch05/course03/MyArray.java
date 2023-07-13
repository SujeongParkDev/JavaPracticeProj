package ch05.course03;

public class MyArray {
	int[] intArr;	// int array
	int count;		// element 개수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -9999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	/**
	 * 매개변수(새로운 값)를 배열의 맨 뒤에 추가하는 함수 
	 * 
	 * @param num 값
	 */	
	public void addElement (int num) {
		if (count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		
		intArr[count++] = num;
		
	}
	
	/**
	 * 매개변수(num)을 매개변수(position)위치에 추가하는 함수 
	 * 
	 * @param position 인덱스
	 * @param num 값
	 */	
	public void insertElement (int position, int num) {
		int i;
		
		if (count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		
		if (position < 0 || position > count) {
			System.out.println("insert Error");
			return;
		}
		
		// 배열의 가장 뒤부터 index+1 자리에 집어넣은 뒤, 중간의 빈 자리를 만들어 num 삽입
		for (i = count-1; i >= position; i--) {
			intArr[i+1] = intArr[i];
		}
		
		intArr[position] = num;
		count++;
		
	}
	
	/**
	 * 해당 인덱스(position)의 요소를 배열에서 꺼낸 뒤 삭제하는 함수 
	 * 
	 * @param position 
	 * @return ret 
	 */	
	public int removeElement (int position) {
		int ret = ERROR_NUM;
		
		if (isEmpty()) {
			System.out.println("There is no element");
			return ret;
		}
		
		if (position < 0 || position > count-1) {
			System.out.println("remove Error");
			return ret;
		}
		
		ret = intArr[position];
		
		// 지우려는 index 뒤의 요소들을 한 칸씩 앞으로 덮어씀.
		for (int i = position; i < count-1; i++) {
			intArr[i] = intArr[i+1];
		}
		
		count--;
		return ret;
	}
	
	/**
	 *  
	 * 
	 * @param 
	 * @return
	 */	
	/*
	public int getElement (int position) {
		if (position < 0 || position > count-1) {
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count + "개입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	*/
	
	/**
	 * 
	 * 
	 * @return count
	 */
	/*
	public int getSize () {
		return count;
	}
	*/
	
	/**
	 * 배열의 element의 개수가 0일때 true, 그 외에 false 반환하는 함수
	 * 
	 * @return boolean true/false 
	 */	
	public boolean isEmpty () {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 *  
	 */	
	/*
	public void printAll () {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다");
			return;
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(intArr[i]);
		}
	}
	*/
	
	/**
	 *  
	 */
	/*
	public void removeAll () {
		for (int i = 0; i < count; i++) {
			intArr[i] = 0;
		}
		count = 0;
	}
	*/
}
