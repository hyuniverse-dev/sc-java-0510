package part1.section02_variable;
/*
 * 
 * 형 변환(Type Casting)
 * 	데이터의 자료형을 다른 자료형으로 변환하는 것
 * 	서로 다른 자료형 간의 연산을 위해 필요
 * 
 * 자동 형 변환(Promotion)
 * 	작은 크기의 자료형에서 큰자료형으로 변환
 * 	데이터 손실 없이 자동으로 변환됨
 * 	변환 방향: byte -> short -> int -> long -> float -> double 
 * 
 * 강제 형 변환(Casting)
 * 	큰 크기의 자료형에서 작은 자료형으로 변환
 * 	데이터 손실 가능성 있음
 * 	명시적으로 변환 지정 필요:(변환할자료형)변수
 * 
 */
public class TypeCasting {
	
	public static void main(String[] args) {
		// 자동 형 변환
		int intValue = 100;
		double doubleValue = intValue;	// int -> double 자동 형 변환
		
		System.out.println("doubleValue: " + doubleValue);
		
		
		// 강제 형 변환
		double pi = 3.14159;
		int intPi = (int)pi; // double -> int 강제 변환(소수점 손실)
		
		System.out.println("intPi: " + intPi);
		
		// 데이터 손실 사례
		int large = 1000000;
		byte small = (byte)large; // int -> byte 강제 형 변환
		
		System.out.println("small: " + small);	// 예상치 못한 값 출력
	}
	
}













