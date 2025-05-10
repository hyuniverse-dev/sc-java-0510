package part1.section09_constructor;

public class Book {
	
	String title;
	String author;
	int price;
	
	// 기본생성자 
	Book() {
		this("제목 미정", "작자 미상", 0);
	}
	
	// 제목만 초기화하는 생성자
	Book(String title){
		this(title, "작자 미상", 0);
	}
	
	// 제목과 저자만 초기화하는 생성자
	Book(String title, String author){
		this(title, author, 0);
	}
	
	// 모든 필드를 초기화하는 생성자
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	void displayInfo() {
		System.out.println("책 제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("가격: " + price);
		System.out.println("------------------");
	}

}









