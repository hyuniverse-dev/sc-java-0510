package part1.section04_conditional;	// 패키지명
/*
 * 제어문
 * 	프로그램 실행 흐름을 제어하는 문장
 * 	조건에 따라 실행문을 선택적으로 실행하거나 반복 실행 가능
 * 	코드의 실행 순서를 비순차적으로 변경
 * 
 * 제어문 종류
 * 	조건문: if, if-else, if-else if, switch
 * 	반복문: for, while, do-while
 * 	분기문: break, continue
 * 
 * 조건문
 * 	조건식의 결과에 따라 실행 흐름을 제어하는 문장
 *  true/false의 boolean 결과에 따라 다른 코드 블록실행
 *  프로그램의 분기 처리에 사용
 * 
 * 1. if문
 * 	if(조건식) {
 * 		// 조건식이 true일 때 실행되는 코드
 * 	}
 * 
 */
public class Conditional01 {	// 클래스명
	
	public static void main(String[] args) {
		int num = 11;
		if(num % 2 == 0) {
			System.out.println("num은 짝수 입니다.");
		}
		
		if(num % 2 == 1) {
			System.out.println("num은 홀수 입니다.");
		}
		
		// 실행 명령어가 하나일 경우 중괄호 생략 가능
		if(num % 2 == 0) 
			System.out.println("num은 짝수 입니다.");
		
		if(num % 2 == 1) 
			System.out.println("num은 홀수 입니다.");
		
	}

}

















