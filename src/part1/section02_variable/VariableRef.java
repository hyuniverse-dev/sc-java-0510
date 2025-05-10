package part1.section02_variable;
/*
 * 참조 자료형
 * 	데이터가 저장된 메모리 주소를 저장
 * 	기본형 외 모든변수는 참조형 변수이다
 * 
 */
public class VariableRef {
	
	public static void main(String[] args) {
		// String 변수 선언 및 초기화
		String greeting = "Hello";
		String name = "Java";
		
		// 문자열 연결  Hello, Java!
		String message = greeting +", " + name + "!";
		System.out.println(message);
		
		// 문자열 길이
		System.out.println("문자열 길이: " + message.length());
		
		// 문자열의 일부 추출
		System.out.println("첫 5글자: " + message.substring(0, 5));
		
	}

}












