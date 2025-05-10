package part1.section05_loop;
/*
 * 중첩 for문
 * 	반복문 안의 반복문
 * 
 * for(초기화식1; 조건식1; 증감식1) {
 * 		// 외부 for문의 코드
 *		for(초기화식2; 조건식2; 증감식2) {
 *			// 내부 for문의 코드
 * 		}
 * 
 * 		// 외부 for문의 추가 코드
 * }
 * 
 * 
 */
public class Loop03 {
	
	public static void main(String[] args) {
		
		// 2단부터 9단까지 반복
		for(int i = 2; i <= 9; i++) {
			
			// 각 단에서 곱하기 하는 부분
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + " = " + (i * j) + "    ");
			}
			
			// 단 별로 줄바꿈
			System.out.println();
			
		}
		
	}
	
}























