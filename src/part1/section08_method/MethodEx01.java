package part1.section08_method;
/*
 * 메서드란?
 * 	클래스 안에서 특정 기능을 수행하기 위한 코드들을 하나의 블록으로 묶은 집합
 * 	필요에 따라 호출하여 재사용 가능한 코드 단위
 * 	코드의 중복을 제거하고 모듈화를 통해 프로그램의 가독성과 유지보수성향상
 * 
 * 메서드의 장점
 * 	코드의 재사용성 증가
 * 	중복 코드 제거
 * 	프로그램의 구조화
 * 	코드의 가독성 향상
 * 	유지보수 용이
 * 
 */
public class MethodEx01 {
	
	public static void main(String[] args) {
		printHello();	// printHello() 메서드 호출
	}
	
	static void printHello() {
		System.out.print("안녕하세요, ");
		System.out.println("만나서 반갑습니다.");
	}
	

}










