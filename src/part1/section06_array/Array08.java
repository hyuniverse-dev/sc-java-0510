package part1.section06_array;

import java.util.Arrays;

/*
 * 깊은복사(Deep Copy) 예제
 * 
 */
public class Array08 {
	
	public static void main(String[] args) {
		
		int[] card = {3, 1, 4, 5, 10};
		
		// 배열의 깊은 복사 - Arrays.copyof(배열, 복사 범위)
		int[] newCard = Arrays.copyOf(card, card.length);
		
		System.out.println("card : " + Arrays.toString(card));
		System.out.println("newCard : " + Arrays.toString(newCard));
		
		newCard[1] = 10;
		
		System.out.println("card : " + Arrays.toString(card));
		System.out.println("newCard : " + Arrays.toString(newCard));
		
		
		
	}

}







