package part1.section03_operator;
/*
 * 3. 비교연산자
 * 	연산 결과를 비교하여 boolean으로 반환한다.
 * 	>	: 크다
 * 	>=	: 크거나 같다
 * 	<	: 작다
 * 	<=	: 작거나 같다
 * 	==	: 같다
 * 	!=	: 같지않다
 * 
 * 
 */
public class Operator03 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean result = a >= b;
		System.out.println("result: " + result);
		
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
	}

}












