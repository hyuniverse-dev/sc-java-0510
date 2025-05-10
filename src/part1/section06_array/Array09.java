package part1.section06_array;
/*
 * 다차원 배열
 * 	2차원 이상의 다차원 배열
 * 	배열의 요소로 다시 배열을 가지는 배열
 * 	행렬, 표, 좌표 등의 데이터 구조를 표현할 때 유용
 * 
 */
public class Array09 {
	public static void main(String[] args) {
		
		// 행과 열을 지정하여 선언
		/*
		int[][] arr = new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		*/
		
		// 선언과 동시에 배열 대입
		int[][] arr = {
							{1, 2, 3}, 
							{11, 12, 13}
						};
		
		
		// 2차원배열 주소 출력
		System.out.println("2차원 배열 : " + arr);
		
		// 1행이 가진 열에 대한 주소 출력
		System.out.println("2차원 배열 1행 : " + arr[0]);
		
		// 행의 크기 출력
		System.out.println("행의 크기: " + arr[0].length);
		
		// 1행 1열의 값 출력
		System.out.println("arr[0][0] = " + arr[0][0]);
		
		// 2행 2열의 값 출력
		System.out.println("arr[1][1] = " + arr[1][1]);
		
	}
}













