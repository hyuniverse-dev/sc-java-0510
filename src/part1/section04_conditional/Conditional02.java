package part1.section04_conditional;
/*
 * 2. if-else문
 * 	두 가지 선택지를 제공하는 if-else문
 * 
 * 	if(조건식) {
 * 		// 조건식이 true일 때 실행되는 코드
 * 	} else {
 * 		// 조건식이 false일 때 실행되는 코드
 * 	}
 * 
 * 
 */
public class Conditional02 {
	
	public static void main(String[] args) {
		
		int num = 11;
		
		if(num % 2 == 0) {
			System.out.println("num은 짝수 입니다.");
		} else {
			System.out.println("num은 홀수 입니다.");
		}
		
		
		if(num % 2 == 0) 
			System.out.println("num은 짝수 입니다.");
		else 
			System.out.println("num은 홀수 입니다.");
		
		
	}

}







