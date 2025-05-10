package part1.section01_intro;
/* 여러줄 주석: 코드에 영향을 주지 않는 공간
 * 
 * 변수란?
 * 	값을 저장하기 위한 메모리 공간
 * 	필요할 때 꺼내 쓸 수 있도록 이름을 붙여 사용
 * 	변수 선언 시 반드시 **자료형(데이터타입)**을 함께 지정해야 함	
 * 
 *  자료형 변수명;  // 변수선언
 *  변수명 = 값;	 // 최초 값 대입을 초기화
 *  
 *  
 */
// 한줄 주석
public class VariableExample {
	
	// 프로그램 시작 main 메서드
	public static void main(String[] args) {
		
		// 문자열(String) 변수 선언 및 초기화
		String name = "홍길동";
		
		// 정수형(int) 변수 선언 및 초기화
		int age = 25;
		
		// 문자형(char) 변수 선언 및 초기화
		char bloodType = 'O';
		
		// 논리형(boolean) 변수 선언 및 초기화 - true 또는 false 값만 가능
		boolean isStudent = true;

		// Ctrl + Alt + ↓ 줄복사
		// Ctrl + D 줄삭제
		// Ctrl + F11 실행
		
		// 변수 값을 콘솔에 출력
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("혈액형: " + bloodType);
		System.out.println("학생 여부: " + isStudent);
		
	}

}




