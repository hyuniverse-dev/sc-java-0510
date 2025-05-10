package part1.section10_extends;

public class Book {
	String title;
	int price;
	
	void info() {
		System.out.println("책의 제목은 " + title + "이고, 가격은 " + price + "원 입니다.");
	}
	
	final void info_title() {
		System.out.println("책의 제목은 " + title + "입니다.");
	}

}
