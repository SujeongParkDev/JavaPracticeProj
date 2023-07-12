package ch02.course08;

public class PersonInfo {

	public String name;
	public int age;
	public double height;
	public double weight;
	public String gender;
	
	public PersonInfo() {
		
	}
	
	public PersonInfo(String name, int age, double height, double weight, String gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	
	/**
	 * 개인정보(이름, 나이, 키, 몸무게, 성별) 반환 
	 * 
	 * @return result
	 */	
	public String showPersonInfo () {
		String result = "";
		result = name + "는 " + age + "세이고, 키는 " + height + "cm, 몸무게는 " + weight + "kg인 " + gender + "입니다.";
		
		return result;
	}
	
}
