package part1.section06_array;

import java.util.Arrays;
import java.util.Collections;

/*
 * Arrays 클래스 예제
 * 
 */
public class Array06 {
	public static void main(String[] args) {
		Integer[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		
		System.out.println("정렬 전 배열: " + Arrays.toString(arr));
		// 배열의 오름차순 정렬
		Arrays.sort(arr);
		System.out.println("오름차순 정렬: " + Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("내림차순 정렬: " + Arrays.toString(arr));
		
	}
	

}








