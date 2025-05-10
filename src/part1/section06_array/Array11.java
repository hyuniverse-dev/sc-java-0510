package part1.section06_array;
/*
 * 향상된 for문(Enhanced for loop)
 * 	JDK 1.5부터 추가된 배열과 컬렉션을 위한 반복문
 * 	배열의 모든 요소를 순차적으로 접근할 때 편리
 * 	인덱스 없이 요소에 직접 접근 가능
 * 	간결하고 가독성이 좋은 코드 작성 가능
 * 
 * 	for(자료형 변수명 : 배열) {
 *		// 반복 실행할 코드 
 * 	}
 * 
 */
public class Array11 {
	public static void main(String[] args) {
		
		String[] fruits = {"사과", "바나나", "딸기", "오렌지", "포도"};
		
		// 일반 for 문
		System.out.println("일반 for문:");
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(i + "번째 과일: " + fruits[i]);
		}
		
		// 향상된 for 문
		System.out.println("향상된 for문:");
		for(String fruit : fruits) {
			/*
			 * 첫번째 반복 : String fruit = fruits[0];
			 * 두번째 반복 : String fruit = fruits[1];
			 * 세번째 반복 : String fruit = fruits[2];
			 * 네번째 반복 : String fruit = fruits[3];
			 * ...
			 */
			
			System.out.println("과일: " + fruit);
		}
		
	}

}












