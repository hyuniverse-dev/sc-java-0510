package part1.section07_class;
/*
 * 정적 멤버(Static Member)
 * 	클래스에 소속된 멤버로 객체 생성 없이 사용 가능
 * 	모든 객체가 공유하는 멤버
 * 	프로그램 시작 시 메모리에 로드되고 프로그램 종료 시 메모리에서 해제
 * 
 */
public class ClassEx03 {
	
	public static void main(String[] args) {
		
		System.out.println(Student.schoolName);
		
		Student stu1 = new Student();
		stu1.studnetName = "김고일";
		
		Student stu2 = new Student();
		stu2.studnetName = "김고이";
		
		System.out.println("stu1 이름: " + stu1.studnetName);
		System.out.println("stu2 이름: " + stu2.studnetName);
		System.out.println("stu1 학교: " + Student.schoolName);
		System.out.println("stu2 학교: " + Student.schoolName);
		
		stu2.studnetName = "박고이";
		Student.schoolName = "한국 고등학교";
		
		System.out.println("==== 변경 후 ====");
		
		System.out.println("stu1 이름: " + stu1.studnetName);
		System.out.println("stu2 이름: " + stu2.studnetName);
		System.out.println("stu1 학교: " + Student.schoolName);
		System.out.println("stu2 학교: " + Student.schoolName);
		
		
	}

}






