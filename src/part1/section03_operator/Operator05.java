package part1.section03_operator;
/*
 * 5. 대입 연산자
 * 	= : 단순대입
 * 	복합대입연산자 - 연산과 대입을 한번에 수행
 * 	+=, -=, *=, /=, %=
 * 
 * 
 */
public class Operator05 {
	
	public static void main(String[] args) {
		// = 대입연산자로 변수 num에 10 저장
		int num = 10;
		
		num += 10;		// num = num + 10;
		System.out.println("num: " + num);
		
		num *= 2;		// num = num * 2;
		System.out.println("num: " + num);
		
		num %= 10;		// num = num % 10;
		System.out.println("num: " + num);
		
	}

}


















