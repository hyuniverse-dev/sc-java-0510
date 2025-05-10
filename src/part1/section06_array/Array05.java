package part1.section06_array;

import java.util.Arrays;

/*
 * Arrays 클래스
 * 	배열을 쉽게 다루는 클래스
 * 	java.util 패키지에 포함된 배열조작 유틸리티 클래스
 * 	배열의 복사, 정렬, 검색 등 다양한 기능 제공
 * 	정적(static) 메서드로 구성되어 있어 객체 생성 없이 사용 가능
 * 
 * 
 */
public class Array05 {
	
	public static void main(String[] args) {
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
		
		// Arrays.toString - 배열의 내용을 문자열로 변환
		System.out.println(Arrays.toString(arr));
		// 실행결과: [1, 6, 2, 3, 10, 7, 4, 5, 8, 9]
		
	}

}







