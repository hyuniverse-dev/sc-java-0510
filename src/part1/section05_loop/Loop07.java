package part1.section05_loop;

import java.util.Scanner;

/*
 * 기타 제어문
 * 1. break 문
 * 	반복문이나 switch 문을 즉시 종료
 * 	가장 가까운 반복문만 빠져나감(중첩된 경우 주의)
 * 	특정 조건에서 반복문을 완전히 종료할 때 사용
 * 
 */
public class Loop07 {
	
	public static void main(String[] args) {
		// 1부터 50까지 랜덤숫자 생성
		int magicNumber = (int)(Math.random() * 50) + 1;
		
		Scanner scan = new Scanner(System.in);
		boolean isMatched = false;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("찾는 숫자를 입력 >> ");
			int guess = scan.nextInt();
			
			if(guess == magicNumber) {
				System.out.println((i+1) + "번째에 맞췄습니다!");
				isMatched = true;
				break;
			} else if(guess > magicNumber) {
				System.out.println("맞춰야할 숫자가 더 작습니다.");
			} else if(guess < magicNumber) {
				System.out.println("맞춰야할 숫자가 더 큽니다.");
			}
		}
		
		if(!isMatched) {
			System.out.println("정답을 맞추지 못했습니다.");
		}
		
	}

}









