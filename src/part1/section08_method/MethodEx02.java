package part1.section08_method;
/*
 * 메서드의 선언과 구조
 * 
 * 접근제한자 반환타입 메서드이름(매개변수1, 매개변수2, ...) {
 * 		// 메서드 내용 (기능구현)
 * 		return 반환값;  // 반환타입이 void가 아닌 경우
 * }
 * 
 * 메서드 구성요소 설명
 * 	1. 접근 제한자 : 메서드에서 접근할 수 있는 범위결정(public, protected, default, private)
 * 	2. 반환 타입 : 메서드가 실행 후 반환하는 값의 데이터 타입(void는 반환값 없음)
 * 	3. 메서드 이름 : 메서드를 호출할 때 사용하는 이름
 * 	4. 매개변수 : 메서드 호출 시 전달되는 입력값
 * 	5. 메서드 내용 : 메서드가 수행할 기능을 구현하는 코드
 * 	6. return 문 : 메서드의 실행 결과를 호출하는 곳으로 반환(void 타입은 생략 가능) 
 * 
 * 
 */

public class MethodEx02 {
	
	public static void main(String[] args) {
		
		int result = add(10, 5);
		System.out.println("result: " + result);
		
		printSum(20, 30);
		
		System.out.println("버전 : " + getVersion());
		
		displayInfo();
		
		
	}
	
	// 1. 매개변수와 반환값이 모두 있는 메서드
	static int add(int a, int b) {	// int a = 10; int b = 5;
		int result = a + b;
		return result;
	}
	
	// 2. 매개변수는 있고 반환값이 없는 메서드
	static void printSum(int a, int b) {
		System.out.println("두 수의 합: " + (a + b));
	}
	
	// 3. 매개변수는 없고 반환값이 있는 메서드
	static String getVersion() {
		return "v1.0";
	}
	
	// 4. 매개변수와 반환값이 모두 없는 메서드
	static void displayInfo() {
		System.out.println("간단한 계산기입니다.");
	}
	

}














