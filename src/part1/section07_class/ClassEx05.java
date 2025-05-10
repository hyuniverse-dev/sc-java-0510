package part1.section07_class;
/*
 * 메서드(Method)
 * 	객체의 동작과 기능을 구현하는 코드 블록
 * 	특정 작업을 수행하는 명령문의 집합
 * 	코드의 재사용성과 모듈화를 높임
 * 
 * 메서드 선언 구조
 * 	접근제한자 반환타입 메서드명(매개변수타입 매개변수명, ...) {
 * 		// 메서드 내용 (기능 구현)
 * 		return 반환값; // 반환 타입이 void가 아닌 경우
 * 	}
 * 
 * 메서드의 특징
 * 	클래스 내에 선언
 * 	메서드 호출 시 실행되고 종료 후 호출한 곳으로 돌아감
 * 	반환 타입이 void가 아니면 반드시 return 문 필요
 * 	다른 메서드 내에서 호출 가능
 * 
 */
public class ClassEx05 {
	
	public static void main(String[] args) {
		Car2 c = new Car2();	// 클래스를 이용해서 객체 생성
		Car2 c2 = new Car2();
		
		System.out.println("c의 주소값: " + System.identityHashCode(c));
		System.out.println("c2의 주소값: " + System.identityHashCode(c2));
		
		// 메서드 호출
		c.ride();
		
		// 매개변수가 있는 메서드 호출
		c.setColor("파란색");
		System.out.println("c.color: " + c.color);
		
		// 반환값이 있는 메서드 호출
		c.wheel = 3;
		int wheelCount = c.getWheelCount();
		System.out.println("바퀴의 개수는 " + wheelCount + "개입니다.");
		
	}

}





