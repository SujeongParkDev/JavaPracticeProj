package ch02.course06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// 생성할 때 매개변수로 멤버변수 초기화까지 함
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	/**
	 * 학번, 학생 이름, 학년을 반환하는 함수
	 * 
	 * @return studentName 학생 이름
	 * 		   studentNumber 학번
	 * 		   grade 학년
	 */
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
