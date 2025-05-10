package part1.section03_operator;
/*
 * 연산자(Operator)
 * 	데이터를 처리하여 결과를 산출하는 기호
 * 
 * 
 * 1. 산술연산자
 * 	+, -, *, /, %(나눈나머지값)
 * 
 */
public class Operator01 {
	
	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 5;
		
		// 두수의 합
		int sum = num1 + num2;
		System.out.println("sum: " + sum);	// 문자열 + 숫자 -> 값이 연결된 문자열
		
		int result = num1 - num2;
		System.out.println("result: " + result);
		
		int result2 = num1 * num2;
		System.out.println("result2: " + result2);
		
		int result3 = num1 / num2;
		System.out.println("result3: " + result3);
		
		int result4 = num1 % num2;
		System.out.println("result4: " + result4);
		
		// 짝수 홀수구분
		int result5 = num1 % 2;
		System.out.println("result5: " + result5);
		
		
	}

}









