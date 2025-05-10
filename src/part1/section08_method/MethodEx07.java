package part1.section08_method;
/*
 * 메서드 오버로딩(Method Overloading)
 * 	같은 이름의 메서드를 매개변수의 타입, 개수, 순서를 다르게 하여 여러 개 정의하는 기법
 * 	동일한 기능을 하지만 다양한 매개변수를 처리할 수 있도록 함
 * 	코드의 가독성과 유지보수성을 높임
 * 
 * 오버로딩 규칙
 * 	메서드의 이름이 동일
 * 	매개변수 타입, 개수, 순서 중 하나 이상이 달라야 함
 * 	반환 타입만 다른경우는 오버로딩이 성립하지 않음
 * 
 * 매개변수(Parameter) - 메서드 정의시 선언하는 변수
 * 인자(Argument) - 매개변수의 전달되는 값
 * 
 */
public class MethodEx07 {
	
	public static void main(String[] args) {
		printInfo();
		
		printInfo("손흥민");
	}
	
	static void printInfo() {
		System.out.println("안녕하세요, 홍길동 입니다.");
	}
	
	static void printInfo(String name) {
		System.out.println("안녕하세요, " + name +" 입니다.");
	}
	
	static void printInfo(String name, String team) {
		System.out.println("안녕하세요, " + name +" 입니다.");
		System.out.println(team + "팀 입니다.");
		
	}
	
	static void printInfo(int age) {
		System.out.println("안녕하세요, 손흥민 입니다.");
		System.out.println("나이는 " + age + "입니다.");
	}
	

}










