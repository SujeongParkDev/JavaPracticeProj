package ch02.course04;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	/**
	 * 학생 이름과 주소를 출력하는 함수
	 */
	public void showStudentInfo() {
		System.out.println(studentID + "학번의 이름은 "+ studentName + " 이고, 주소는" + address + "입니다.");
	}

	/**
	 * 학생 이름을 반환하는 함수
	 * 
	 * @return studentName 학생 이름
	 */
	public String getStudentName () {
		return studentName;
	}
	
	/**
	 * 학생 이름을 세팅하는 함수
	 * 
	 * @param name 학생 이름
	 */
	public void setStudentName (String name) {
		studentName = name;
	}
}
