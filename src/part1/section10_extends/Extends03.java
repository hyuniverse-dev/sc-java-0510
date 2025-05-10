package part1.section10_extends;
/*
 * 메서드 오버라이딩
 * 	부모 클래스에서 상속받은 메서드를 자식 클래스에서 재정의하는 것
 * 	같은 메서드 이름, 같은 매개변수, 같은 반환 타입을 가지지만 구현 내용이 다름
 * 	자식 클래스의 특성에 맞게 메서드의 동작을 변경할 수 있음
 * 	
 * 오버라이딩 규칙
 * 	메서드 이름, 매개변수 타입, 개수, 순서, 반환 타입이 모두 같아야 함
 * 	접근 제한을 더 강하게 할 수 없음(부모가 public이면 자식도 public이어야 함)
 * 	부모 메서드보다 더 많은 예외를 선언할 수 없음
 * 
 * @Override 애노테이션
 * 	메서드가 오버라이딩되었음을 명시적으로 선언
 * 	컴파일러가 오버라이딩 규칙 준수 여부를 검사하도록 함
 * 	선택사항이지만 사용을 권장(실수 방지)
 * 
 * 
 * 
 */
public class Extends03 {
	
	public static void main(String[] args) {
		SchoolBus sb = new SchoolBus(10);
		sb.takePerson();
		sb.ride();
	}

}





















