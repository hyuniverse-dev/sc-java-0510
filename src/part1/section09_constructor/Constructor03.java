package part1.section09_constructor;
/*
 * this() 메서드
 * 	같은 클래스의 다른생성자를 호출할 때 사용하는 메서드
 * 	생성자 간의 코드 중복을 제거하기 위해 사용
 * 	생성자의 첫 줄에서만 사용 가능
 * 
 */
public class Constructor03 {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("자바 프로그래밍");
		Book book3 = new Book("파이썬 기초", "Dev Kim");
		Book book4 = new Book("데이터 분석 기초", "이분석", 25000);
		
		book1.displayInfo();
		book2.displayInfo();
		book3.displayInfo();
		book4.displayInfo();
		
		
	}

}













