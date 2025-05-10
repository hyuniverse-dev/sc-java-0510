package part1.section06_array;
/*
 * 배열 초기화 방법
 * 
 * 방법 1: 인덱스로 접근하여 각 요소 초기화
 * 방법 2: 선언과 동시에 초기화
 * 방법 3: 생성 후 초기값 한번에 할당
 * 
 * 
 * Alt + Shift + A 세로편집모드
 */
public class Array03 {
	
	public static void main(String[] args) {
		
		// 방법 1: 인덱스로 접근하여 각 요소 초기화 
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// 방법 2: 선언과 동시에 초기화
		int[] arr2 = {10, 20, 30};
		
		// 방법 3: 생성 후 초기값 한번에 할당    
		int[] arr3 = new int[] {10, 20, 30};
		
		printArr(new int[] {10, 20, 30});
		
	}
	
	public static void printArr(int[] arr) {	// int[] arr = new int[] {10, 20, 30}; 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

}










