package part1.section10_extends;
/*
 * 상속
 * 	기존에 정의된 클래스의 멤버(필드, 메서드)를 새로운 클래스가 물려 받는 것
 * 	코드의 재사용성을 높이고 클래스 간의 계층적 관계를 구성
 * 	중복 코드를 줄이고 유지보수성을 향상시키는 객체지향 프로그래밍의 핵심 개념
 * 
 * 상속의 특징
 * 	자바는 단일 상속만 지원(한 클래스는 하나의 클래스만 상속 가능)
 * 	모든 클래스는 자동으로 Object클래스를 상속
 * 	상속받은 메서드는 오버라이딩(재정의)할 수 있음
 * 	생성자와 초기화 불록은 상송되지 않음
 * 
 * 상속 관련 용어
 * 	부모 클래스(상위 클래스, 슈퍼클래스): 상속해주는 클래스
 * 	자식 클래스(하위 클래스, 섭 클래스): 상속받은 클래스
 * 
 */
public class Extends01 {
	
	public static void main(String[] args) {
		
		Comic comicBook = new Comic();
		comicBook.title = "포켓몬";
		comicBook.price = 4500;
		
		comicBook.info();
		
	}

}




















