package part1.section02_variable;

import java.math.BigDecimal;

/*
 * 데이터 표현방식
 * 	컴퓨터는 2진수로 표현(bit)
 * 
 * 	정수표현
 * 		부호비트(Most Significant Bit) + 수치비트
 * 
 * 		예) 10진수 5를 1바이트 -> 0 0000101
 * 
 * 	실수 표현(부동소수)
 * 		부호비트 + 지수부(e)비트 + 가수부(m)비트
 * 	실수 표현 수식
 * 		±(1.m)*2^(e-127) -> 32비트
 * 
 * 
 *	
 *	0.1(10진수) 2진수 변환
 *
 *	0.1 X 2 = 0.2 (0)
 *	0.2 X 2 = 0.4 (0)
 *	0.4 X 2 = 0.8 (0)
 *	0.8 X 2 = 1.6 (1)
 *	0.6 X 2 = 1.2 (1)
 *	0.2 X 2 = 0.4 (0)
 *	0.4 X 2 = 0.8 (0)
 *	0.8 X 2 = 1.6 (1)
 *	0.6 X 2 = 1.2 (1)
 *	....
 *
 *	0.1 -(2진수 변환)-> 0.0001100110011001100...(무한순환소수)
 *	정규화 1.100110011...
 *  ±(1.m)*2^(e-127) -> 32비트
 *  
 *  m: 100110011... , e:123(10) -> 01111011 
 *  0 | 01111011 | 10011001100110011001100
 *  부호비트(1) | 지수부(8) | 가수부(23)
 *  
 *  
 *  실수 값을 저장할 때 데이터 크기가 큰 타입일수록 근사치에 가까워진다!
 * 
 * 
 * 
 */
public class DataEx {
	
	public static void main(String[] args) {
		
		float fNum = 0.0f;
		double dNum = 0.0;
		BigDecimal bNum = BigDecimal.valueOf(0);

		/*
		 * 반복문
		 * 
		 * for(초기식; 조건식; 증감식) {
		 * 		반복실행할 코드
		 * }
		 * 
		 */
		for(int i = 0; i < 100; i++) {
			fNum = fNum + 0.1f;
			dNum = dNum + 0.1;
			bNum = bNum.add(BigDecimal.valueOf(0.1));
		}
		
		System.out.println("fNum: " + fNum);
		System.out.println("dNum: " + dNum);
		System.out.println("bNum: " + bNum.setScale(1000));
		
	}

}







