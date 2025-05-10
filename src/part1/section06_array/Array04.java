package part1.section06_array;

/*
 * 배열 예제
 * 
 */

public class Array04 {
	
	public static void main(String[] args) {
		
		// 문자열 배열 객체 생성하기
		String[] pokemons = new String[6];
		
		// 배열에 값 대입하기
		pokemons[0] = "피카츄";
		pokemons[1] = "라이츄";
		pokemons[2] = "파이리";
		pokemons[3] = "꼬부기";
		pokemons[4] = "버터플";
		pokemons[5] = "야도란";
		
		
		// 값 가져오기
		System.out.println(pokemons[3]);
		
		// 배열의 길이
		System.out.println(pokemons.length);
		
		// 값 수정하기
		pokemons[2] = "잠만보";
		
		
		// 배열 for문을 사용하여 전체 출력하기
		for(int i = 0; i < pokemons.length; i++) {
			System.out.println(pokemons[i]);
		}
		
	}

}














