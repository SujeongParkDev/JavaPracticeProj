package ch02.course06;

public class StudentTest {

	public static void main(String[] args) {
		
		// 생성자를 만든 경우 기본 생성자가 제공되지 않음. => 별도로 기본 생성자를 만들어야 함.
//		Student studentLee = new Student();
		Student studentLee = new Student(12345, "Lee", 3);
		
		String data = studentLee.showStudentInfo();
		System.out.println(data);
		
	}

}
