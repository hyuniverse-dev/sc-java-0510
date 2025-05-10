package part1.section06_array;
/*
 * 다차원 배열 예제
 * 
 */
public class Array10 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int count = 1;
		// 1부터 25까지 차례대로 배열에 값을 넣는다.
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = count++;
			}
		}
		
		// 배열 출력하기
		/*
		 * 1 2 3 4 5 
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 * 
		 */
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println(); // 개행
		}
		
		
		
	}
}






