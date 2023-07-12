package ch02.course07;

public class UserInfo {
	
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	
	/*
	 * 오버로딩(overloading)
	 * 메서드 이름은 같으나 매개변수만 다를 때 "오버로딩" 이라고 함.
	 * 사용하는 쪽(Client)의 편의성 위해 오버로딩을 제공함.
	 */
	public UserInfo() {
		
	}
	
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	/**
	 * 사용자정보(사용자 아이디, 사용자 이름) 반환 
	 * 
	 * @return result
	 */	
	public String showUserInfo () {
		String result = "";
		result = "고객님의 아이디는 " + userId +"이고, 등록된 이름은 " + userName + "입니다.";
		
		return result;
	}
}
