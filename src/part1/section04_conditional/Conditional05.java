package part1.section04_conditional;

import java.util.Scanner;

/*
 * 4. switch문
 * 	다양한 경우의 수를 처리하는 제어문
 * 	주어진 변수 값에 따라 여러 case로 분기 실행
 * 
 * 	switch(변수) {
 * 		case 값1:
 * 			// 변수가 값1과 같을 때 실행되는 코드
 * 			break;
 * 		case 값2:
 * 			// 변수가 값2와 같을 때 실행되는 코드
 * 			break;
 * 		default:
 * 			// 변수가 어떤 case와 일치하지 않을 때 실행되는 코드
 * 	}
 * 
 * 
 */
public class Conditional05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(w, a, s, d): ");
		
		// 입력된 문자열의 첫 번째 문자만 가져옴
		char key = scanner.next().charAt(0);
		
		switch(key) {
		case 'w':
			System.out.println("앞으로 이동");
			break;
		case 'a':
			System.out.println("좌측으로 이동");
			break;
		case 's':
			System.out.println("뒤로 이동");
			break;
		case 'd':
			System.out.println("우측으로 이동");
			break;
		default:
			System.out.println("Hold!");
			break;
		}
		
		scanner.close();
		
		
	}
	
}









