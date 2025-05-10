package part1.section03_operator;
/*
 * 4. 논리 연산자
 * 	&& : And 조건, 교집합 개념, 두 항 모두 true 일때 true
 * 	|| : Or 조건, 합집합 개념, 두 항 중 하나이상 true 일때 true
 * 	!  : Not 조건, 여집합 개념, 논리(boolean)값 반전
 * 	^  : XOR 조건, 두 조건이 서로 다를 때만 true
 * 
 * 
 */
public class Operator04 {
	
	public static void main(String[] args) {
		
		boolean result = true && false;
		System.out.println("true && false: " + result);
		
		result = true || false;
		System.out.println("true || false: " + result);
		
		
		result = !result;
		System.out.println("!result: " + result);
		
		// 배타적 논리 XOR
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 ^ b2);
		System.out.println(b1 ^ b3);
		
		
		System.out.println(false ^ true); // XOR 두 조건이 서로 다를 때만 true
		
	}

}







