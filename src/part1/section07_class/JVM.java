package part1.section07_class;
/*
 * JVM(JAVA Virtual Machine)
 * 	자바 애플리케이션을 실하기 위한 가상머신
 * 	JVM 운영체제와 자바 애플리케이션 사이 중계자 역할을 한다
 * 
 * JVM 메모리 구조
 * 	1. 메서드 영역(Method 영역)
 * 		JVM이 실행하는 애플리케이션 사용되는 클래스 정보 저장
 * 		정적(static)변수, 상수 등 저장
 * 		JVM이 시작될 때 클래스 로더에 의해 로드되며, 모든 스레드가 공유하는 영역
 *  2. 힙 영역(Heap 영역)
 *  	모든 객체와 배열이 저장되는 공간
 *  	가비지 컬렉터가 더 이상 참조되지 않는 객체를 제거한다
 *  3. 스택 영역(Stack 영역)
 *  	각 스레드마다 하나씩 생성된다
 *  	메서드 호출시 생성되는 스택프레임을 저장
 *  	지역변수, 매개변수, 메서드 정보 등이 저장
 *  	메서드 호출이 끝나면 스택 프레임 제거
 * 
 */

class Person {
	static String country = "한국";
	
	String name;
	int age;
	
	public void introduce() {
		String greeting = "안녕하세요!";
		System.out.println(greeting + " 저는 " + name +"이고, " + age + "살 입니다.");
		System.out.println("저는 " + country + "에 살고 있습니다.");
	}
	
	public static void changeCountry() {
		country = "대한민국";
	}
}


public class JVM {
	
	public static void main(String[] args) {
		
		int count = 2;
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "홍길동";
		person1.age = 25;
		
		person2.name = "손흥민";
		person2.age = 32;
		
		person1.introduce();
		person2.introduce();
		
		Person.changeCountry();
		
	}

}














