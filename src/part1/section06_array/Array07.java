package part1.section06_array;

import java.util.Arrays;

/*
 * 배열의 복사
 * 	배열의 크기를 변경할 때
 * 	배열의 내용을 보존하면서 새로운 작업을 수행할 때
 * 	원본 배열을 유지하면서 내용을 수정할 때
 * 
 * 배열 복사의 종류
 * 	얕은 복사(Shallow Copy): 참조만 복사, 동일한 배열 객체 공유
 * 	깊은 복사(Deep Copy): 배열 요소의 값을 새로운 배열에 복사, 독립적인 배열 객체 생성
 * 
 */
public class Array07 {
	
	public static void main(String[] args) {
		
		int[] arr01 = {1, 2, 3};
		// 배열의 얕은 복사
		int[] arr02 = arr01;
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		
		// arr02 배열 값 변경
		arr02[1] = 10;
		
		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));

		
	}

}






