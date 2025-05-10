package part1.section02_variable;
/*
 * prinf - print fommatted
 * 
 * 서식문자
 * 	%d : 정수(10진수)
 *  %f : 실수
 *  %s : 문자열
 *  %c : 문자
 *  %x : 정수(16진수)
 *  %o : 정수(8진수)
 *  
 *  
 *  이스케이프(Escape) 문자 - 특정한 문자나 문자열을 특별한 용도로 해석하도록 하는 문자
 *  	\n : 새 줄(줄 바꿈)을 나타낸다.
 *  	\t : 탭 문자를 나타낸다.
 *  	\\ : 역슬래시 자체를 나타낸다.
 *  	\" : 쌍따옴표를 나타낸다.
 *  	\' : 작은따옴표를 나타낸다.
 *  	\r : 캐리지 리턴 나타낸다. (커서 맨앞줄로 이동)
 *  	\b : 백스페이스를 나타낸다.
 *  
 * 
 */
public class ConsolePrintf {
	
	public static void main(String[] args) {
		
		// 정수출력
		System.out.printf("저는 대학교 %d학년에 재학중입니다!\n", 3);
		
		// 여러 서식문자 사용
		System.out.printf("%d은 첫번째, %f은 두번째, %s은 세번째.\n", 1, 2.0, "셋");
		
		// 이스케이프 예제
		System.out.println("\"Hello, World!\"");
		
		System.out.println("안녕하세요.\n이것은 줄 바꿈입니다.\n탭 간격 : \t1\t2\t3");
		
			
	}

}











