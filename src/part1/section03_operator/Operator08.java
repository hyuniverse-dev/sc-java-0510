package part1.section03_operator;
/*
 * 8. 삼항 연산자 
 * 	조건식 ? 피연산자1(조건식이 참일 경우 반환) : 피연산자2(조건식이 거짓일 경우 반환)
 * 
 */
public class Operator08 {
	
	public static void main(String[] args) {
		
		int num = 10;
		String result;
		
		result = num > 0 ? "num은 양수" : "num은 음수";
		
		System.out.println(result);
	}

}









