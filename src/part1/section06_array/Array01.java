package part1.section06_array;
/*
 * 배열 (Array)
 * 	같은 자료형의 변수를 여러 개 만들어 하나의 이름으로 관리하는 자료구조
 * 	연속된 메모리 공간에 데이터를 저장
 * 	인덱스(index)를 통해 각 요소에 접근 가능
 * 
 */
public class Array01 {
	
	public static void main(String[] args) {
		// 배열없이 여러데이터 관리
		int num01 = 1;
		int num02 = 2;
		int num03 = 3;
		int num04 = 4;
		
		System.out.println("num01: " + num01);
		System.out.println("num02: " + num02);
		System.out.println("num03: " + num03);
		System.out.println("num04: " + num04);
		
		// 배열 선언과 동시에 초기화
		int[] numArr = {1, 2, 3, 4};
		
		System.out.println("numArr[0]: " + numArr[0]);
		System.out.println("numArr[1]: " + numArr[1]);
		System.out.println("numArr[2]: " + numArr[2]);
		System.out.println("numArr[3]: " + numArr[3]);
		
		
		for(int i = 0; i < 4; i++) {
			System.out.println(numArr[i]);
		}
		
		
	}
	
}






