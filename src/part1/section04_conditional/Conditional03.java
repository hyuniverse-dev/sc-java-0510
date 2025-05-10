package part1.section04_conditional;
/*
 * 3. if-else if문
 * 	다중 조건 처리
 * 
 * 	if(조건식1) {
 * 		// 조건식1이 true일 때 실행되는 코드
 * 	} else if(조건식2) {
 * 		// 조건식1이 false이고, 조건식2가 true일 때 실행되는 코드
 *  } else {
 *  	// 모든 조건식이 false일 때 실행되는 코드
 *  }
 * 
 */
public class Conditional03 {
	
	public static void main(String[] args) {
		
		int favorite = 7;
		
		int age = 19;
		
		if(favorite < 5) {
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		} else if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else {	// else 블록은 선택사항
			System.out.println("좋아하는 숫자가 5입니다.");
		}
		
	}

}









