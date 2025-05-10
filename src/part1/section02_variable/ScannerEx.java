package part1.section02_variable;

import java.util.Scanner;
/*
 * 
 * Scanner 클래스
 * 	java.util 패키지에 포함된 클래스
 * 	키보드 입력을 위해 가장 많이 사용되는 클래스
 * 	다양한 자료형의 데이터 입력 가능
 * 
 * import 하는방법 3가지
 * 	직접 작성하기
 * 	타입뒤에 커서두고 Ctrl + space -> 하나씩 임포트
 * 	Ctrl + Shift + o	-> 여러개 임포트
 * 
 */
public class ScannerEx {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);

		// 정수 입력 받기
		System.out.println("나이를 입력해 주세요.");
		int age = scanner.nextInt();
		System.out.printf("내 나이는 %d세입니다.", age);

		// 문자열 입력 받기
		System.out.println("\n이름을 입력해 주세요.");
		String name = scanner.next();
		System.out.println("안녕하세요, " + name + "님!");

		// scanner 자원 해제
		scanner.close();

	}

}
