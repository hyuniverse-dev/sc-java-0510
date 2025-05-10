package part1.section07_class;
/*
 * 생성자(Constructor)
 * 	객체가 생성될 때 호출되어 초기화를 담당하는 특별한 메서드
 * 	객체의 필드 초기화 및 메모리 할당
 * 	new 연산자와 함께 사용됨
 * 
 * 생성자의 특징
 * 	클래스 이름과 동일한 이름을 가짐
 * 	반환 타입이 없음(void도 사용하지 않음)
 * 	객체 생성시 자동으로 한 번만 호출됨
 * 	명시적으로 선언하지 않으면 기본 생성자가 자동으로 생성됨
 * 
 * 기본 생성자(Default Constructor)
 * 	매개변수가 없는 생성자
 * 	개발자가 생성자를 작성하지 않으면 컴파일러가 자동으로 생성
 * 	다른 생성자를 작성하면 기본 생성자는 자동으로 생성되지 않음
 * 
 */
public class ClassEx06 {
	
	public static void main(String[] args) {
		
		// 객체 생성 시 생성자 자동 호출
		Car2 myCar = new Car2();
		
		System.out.println("myCar 바퀴 개수: " + myCar.wheel);
		System.out.println("myCar 색상: " + myCar.color);
		
		
	}
	

}









