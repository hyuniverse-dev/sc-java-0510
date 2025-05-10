package part1.section05_loop;

/*
 * for문 예제
 * 
 */

public class Loop02 {
	public static void main(String[] args) {
		
		int sum = 0;
		// 1부터 100까지 반복
		for(int i = 1; i <= 100; i++) {
			// 2로 나누어 떨이지면 짝수
			if(i % 2 == 0) {
				sum += i;	// 짝수의 합을 더한다
			}
		}
		
		System.out.println("합: " + sum);
		
	}

}












