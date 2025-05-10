package part1.section07_class;
/*
 * 객체 지향 프로그래밍(OOP - Object Oriented Programming)
 * 	객체를 중심으로 프로그램을 설계하는 프로그래밍
 * 	현실 세계의 객체를 소프트웨어로 모델링하는 방법
 * 	데이터와 그 데이터를 처리하는 메서드를 하나의 객체로 묶음
 * 
 * 객체(Object)
 * 	물리적으로 존재하거나, 추상적으로 생각할 수 있는 것
 * 	식별가능하고 정의 가능한 것을 말한다
 * 
 * 	예) 물리적인 객체 - 컴퓨터, 커피, 휴대폰, 사람, 학생, 자동차
 * 		추상적인 객체 - 주문정보, 영수증
 * 
 * 객체의 구성요소
 * 	1) 속성 - 변수
 * 	2) 기능 - 메서드
 * 	3) 생성자 - 초기화 담당
 * 
 * 		ex) 티모
 * 			속성
 * 				1) hp - 300
 * 				2) mp - 200
 * 				3) speed - 5
 * 			기능(Skill)
 * 				1) 실명 - 상대 챔프 침묵 + 독데미지
 * 				2) 신속한 이동 - 3초간 speed + 2
 * 
 * 클래스(Class)
 * 	객체를 생성하기 위한 제작 설계도 (붕어빵 틀, 와플기계)
 * 	Class로 작성된 코드를 읽어 인스턴스화(객체화) -> 메모리에 저장
 * 
 * 객체화 - new 연산자로 개체화 가능하다
 * 	클래스명(타입) 변수명 = new 클래스();
 * 
 * 클래스 구조
 * (접근 제한자) class 클래스명 (extends 슈퍼클래스) (implements 인터페이스) {
 * 		
 * 		(생성자) - 초기화
 * 
 * 		변수 - 속성(필드 or 멤버변수)
 * 		메서드 - 기능(멤버 메서드)
 * 
 * }
 * 
 * 객체화 - new 연산자로 인스턴스화, 메모리에 저장 의미
 * 
 * 가비지 콜렉터(Garbage Collector)
 * 	자바에서 동적으로 할당된 메모리(Heap영역) 중에서 더이상 사용되지 않는 메모리를 
 * 	해제하는 기능을 수행하는 프로그램
 * 
 */

class Car {
	
	int wheel = 4;			// 바퀴 개수
	String color = "흰색";	// 색상
	double speed = 0.0;
	
	// 메서드 선언
	void accelerate() {
		speed += 10.0;
		System.out.println("가속합니다. 현재 속도: " + speed + "km/h");
	}
	
	void brake() {
		speed -= 10.0;
		if(speed < 0) {
			speed = 0;
		}
		
		System.out.println("감속합니다. 현재 속도: " + speed + "km/h");
	}
	
}

public class ClassEx01 {
	
	public static void main(String[] args) {
		
		// Car 객체 생성
		Car mycar = new Car();
		Car friendCar = new Car();
		friendCar.wheel = 3;
		friendCar.color = "Red";
		
		// 필드 값 출력
		System.out.println("바퀴 개수: " + mycar.wheel);
		System.out.println("색상: " + mycar.color);
		System.out.println("현재 속도: " + mycar.speed);
		
		System.out.println("friendCar 바퀴 개수: " + friendCar.wheel);
		System.out.println("friendCar 색상: " + friendCar.color);
		System.out.println("friendCar 현재 속도: " + friendCar.speed);
		
		
		// 메서드 호출
		mycar.accelerate();	// mycar.speed = mycar.speed + 10 출력
		mycar.accelerate();	// mycar.speed = mycar.speed + 10 출력
		mycar.brake();		// mycar.speed = mycar.speed - 10 출력
		
		
	}

}









