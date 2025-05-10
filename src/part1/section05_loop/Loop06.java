package part1.section05_loop;

import java.util.Scanner;

/*
 * do-while 예제
 * 
 */
public class Loop06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n===== 메뉴 =====");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 조회");
			System.out.println("3. 데이터 수정");
			System.out.println("4. 종료");
			System.out.println("메뉴를 선택하세요: ");

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("데이터 입력 가능을 실행합니다.");
				break;
			case 2:
				System.out.println("데이터 조회 가능을 실행합니다.");
				break;
			case 3:
				System.out.println("데이터 수정 가능을 실행합니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
				break;
			} // switch End

		} while (choice != 4); // do-while End

		scanner.close();
	}

}
