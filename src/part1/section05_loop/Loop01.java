package part1.section05_loop;
/*
 * 반복문
 * 	특정 코드를 여러 번 반복해서 실행하는 제어문
 * 	동일한 작업을 반복할 때 코드의 효율성 증가
 * 	배열이나 컬렉션의 모든 요소를 처리할 때 유용
 * 
 * 반복문 종류
 * 	for문
 * 	while문
 * 	do-while문
 * 
 * 1. for문
 * 	정해진 횟수만큼 반복하는 for문
 * 
 * 	for(초기화식; 조건식; 증감식) {
 *		// 반복 실행할 코드 
 * 	}
 * 
 * 
 * for문의 실행순서
 * 	1. 초기화식 실행(최초 한번만)
 * 	2. 조건식 평가(true이면 계속, false종료)
 * 	3. 코드블록 실행
 * 	4. 증감식 실행
 * 	5. 2~4번 과정 반복
 * 
 */

public class Loop01 {
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;	// sum = sum + i
		}
		
		System.out.println("합: " + sum);
	}

}








