package part1.section03_operator;
/*
 * 6. 비트연산자
 * 	2진수로 표현된 두 비트 연산자
 * 
 * 	&: 대응되는 비트가 모두 1이면 1을 반환(비트 And 연산자)
 * 	|: 대응되는 비트 중 하나라도 1이면 1을 반환(비트 Or 연산자)
 *  ^: 대응되는 비트가 서로 다르면 1을 반환(비트 XOR 연산자)
 *  ~: 대응되는 비트가 1이면 0으로, 0이면 1로 반전(비트 Not 연산자)
 * 
 */
public class Operator06 {
	public static void main(String[] args) {
		
		int num1 = 3;	//  0 0011
		int num2 = 5;	//  0 0101
						
		
		System.out.println("num1 & num2: " + (num1 & num2));	//& 0 0001 => 1
		System.out.println("num1 & num2: " + (num1 | num2));	//| 0 0111 => 7
		System.out.println("num1 & num2: " + (num1 ^ num2));	//^ 0 0110 => 6
		
		//  3: 0 0011
		// ~3: 1 1100
		System.out.println("~num1: " + ~num1);
		
	}

}














