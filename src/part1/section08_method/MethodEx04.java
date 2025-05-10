package part1.section08_method;
/*
 * 배열 매개변수
 * 	여러 값을 하나의 변수로 묶어서 전달 가능
 * 	배열은 참조 타입이므로 원본배열의 값이 변경될 수 있음
 * 	배열의 크기에 상관없이 모든 요소를 처리할 수 있는 메서드 작성 가능
 * 
 */

class Calc {
	void sum(int... nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i]; // 매개변수로 받은 배열의 요소 값을 하나씩 result 값에 더함
		}
		
		System.out.println("숫자들의 합은 " + result + "입니다.");
	}
}

public class MethodEx04 {
	
	public static void main(String[] args) {
		int nums[] = {100, 200};	// 배열 생성 
		Calc calc = new Calc();	// Calc 객체 생성
		calc.sum(nums);
	}

}























