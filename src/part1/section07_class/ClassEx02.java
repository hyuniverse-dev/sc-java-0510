package part1.section07_class;

/*
 * 필드(Field), 멤버변수 
 *  객체의 속성을 의미
 *  클래스 내에 선언된 변수
 *  객체의 상태와 정보를 저장
 *  객체가 생성될 때 메모리에 할당됨
 *  
 * 필드의 특징
 * 	클래스 내부에 선언
 * 	접근 제한자로 접근 범위 지정가능
 * 	초기화 하지 않으면 자료형에 따른 기본값으로 자동 초기화
 * 	인스턴스 필드와 정적(static)필드로 구분
 * 
 * 필드의 기본값
 * 	byte, short, int, long => 0
 * 	float, double => 0.0
 * 	char => '' 공백
 * 	boolean => false
 * 	참조형 => null
 *  
 *  
 */

class Singer {
	/*
	 * 가수 클래스 속성
	 * 
	 * 이름(문자열)
	 * 성별(문자 M:남성 F:여성)
	 * 소속사(문자열)
	 * 노래목록(문자열 배열)
	 * 그룹여부(논리형)
	 */
	
	String name;
	char gender;
	String agency;
	String[] songs = new String[3];
	boolean isGroup;
	
}

public class ClassEx02 {
	
	public static void main(String[] args) {
		Singer singer1 = new Singer();
		
		singer1.name = "제니";
		singer1.gender = 'F';
		singer1.agency = "개인소속사";
		singer1.isGroup = false;
		singer1.songs[0] = "노래1";
		singer1.songs[1] = "노래2";
		singer1.songs[2] = "노래3";
		
		System.out.println("이름: " + singer1.name);
		System.out.println("성별: " + singer1.gender);
		System.out.println("소속사: " + singer1.agency);
		if(!singer1.isGroup) {
			System.out.println("솔로가수!");
		}
		// 향상된 for문
		System.out.println("노래목록: ");
		for(String song : singer1.songs) {
			System.out.println("\t" + song);
		}
		
	}

}











