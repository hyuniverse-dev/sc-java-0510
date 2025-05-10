package part1.section05_loop;
/*
 * 2. continue 문
 * 	현재 반복을 중단하고 다음 반복으로 넘어감
 * 	반복문은 종료되지 않고 계속 실행됨
 * 	특정 조건의 처리를 건너뛰고 싶을 때 사용
 * 
 */
public class Loop08 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++ ) {
			// 홀수인 경우 현재 차수를 종료하고 다음 반복 실행
			if(i % 2 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("짝수 합: " + sum);
		
	}

}














