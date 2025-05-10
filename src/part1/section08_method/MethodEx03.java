package part1.section08_method;
/*
 * 매개변수 특징
 * 	1. 개수의 제한이 없음(복수의 매개변수는 콤마로 구분)
 * 	2. 서로 다른 타입의 매개변수 선언가능
 * 	3. 매개변수는 매서드 내부의 지역 변수로 취급됨
 * 	4. 메서드가 종료되면 매개변수도 소멸됨
 * 
 * 매개변수 종류
 * 	기본 타입 매개변수: 값의 복사가 일어나 원본 데이터 변경 없음
 * 	참조 타입 매개변수: 주소값의 복사가 일어나 원본 데이터 변경 가능
 * 
 */

class Books {
	int bookCount;
	
}


public class MethodEx03 {
	
	public static void main(String[] args) {
		
		int price = 10000;
		Books books = new Books();
		books.bookCount = 3;	// 책 3권
		System.out.println("1-1. 책은 " + books.bookCount +"권 입니다.");
		System.out.println("1-2. 책 각격은 권당 " + price + "원 입니다.");
		
		changeBooks(books);
		changePrice(price);
		
		System.out.println("2-1. 책은 " + books.bookCount +"권 입니다.");
		System.out.println("2-2. 책 각격은 권당 " + price + "원 입니다.");
		
	}
	
	public static void changeBooks(Books books) {	// Books books = 참조값(주소값)
		books.bookCount += 1;
	}
	
	public static void changePrice(int price) {		// int price = 10000(실제값)
		price += 1000;	// price = 11000
	}
	
}










