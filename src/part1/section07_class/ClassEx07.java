package part1.section07_class;
/*
 * 정리!
 * 
 * 객체의 구성요소
 * 
 * 1. 속성 - 변수(필드, 멤버변수)
 * 	데이터를 저장하고 조작하는데 사용되는 메모리 이름
 * 	- 선언 및 초기화
 * 	자료형(type) 변수명 = 값 또는 new 클래스();
 * 	
 * 	1) 타입의 따른 분류
 * 		기본형 - 예약어, 소문자 시작, 직접 값을 저장
 * 				8가지 - boolean, char, byte, short, int, long, float, double 
 * 		참조형 - 기본형 외 나머지 전부 참조형이다
 * 				String
 * 	2) 선언 위치에 따른 분류
 * 		전역변수 - 클래스 안에 선언된 변수(필드, 멤버변수)
 * 				초기화 하지 않으면 default 값이 들어간다.
 * 					boolean - false
 * 					정수형 - 0
 * 					실수형 - 0.0
 * 					문자형 - ''
 * 					참조형 - null
 * 		지역변수 - 메서드 또는 생성자 또는 매개변수 선언된 변수
 * 				메서드 종료시 같이 소멸된다
 * 				매개변수도 지역변수이다
 * 				초기화 하지 않으면 사용할 수 없다(컴파일 에러 발생)
 * 
 * 	3) 인스턴스 변수 또는 정적(static) 변수 
 * 		정적(static) - static 예약어로 선언
 * 					같은 타입 모든 객체가 공유하는 변수
 * 					클래스명으로 접근 가능하다.
 * 					객체 생성없이 사용 가능
 */


public class ClassEx07 {
	static String name = "홍길동";
	
	
	public static void main(String[] args) {
		System.out.println(name);
		
		Card card1 = new Card();
		
		card1.cardInfo();	
		
		
	}

}








