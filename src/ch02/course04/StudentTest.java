package ch02.course04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 생성자
		// "학생" 이라는 클래스는 하나지만 그 클래스로 여러 명의 학생을 생성할 수 있음.
		// 이렇게 생성된 객체를 "인스턴스" 라고 함 - 인스턴스는 힙 메모리에 생성됨
		
		studentLee.studentName = "이순신";
		studentLee.studentID = 12345;
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(); // 생성자
		studentKim.setStudentName("김유신");
		studentLee.studentID = 12346;
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		/*
		 * studentLee, studenKim - 참조변수. 생성된 곳의 메모리 위치를 나타냄. 
		 */		
		
//		System.out.println(studentLee);
//		System.out.println(studentKim);
	}

}
