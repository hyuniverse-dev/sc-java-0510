package part1.section07_class;

public class Card {
	
	// 카드크기
	// 기본형/전역/static
	static int width = 62;
	static int height = 88;
	
	// 참조형/전역/인스턴스
	String type = "Spade";
	String num = "A";
	
	void cardInfo() {
		System.out.println("card width: " + width);
		System.out.println("card height: " + height);
		System.out.println("card type: " + type);
		System.out.println("card num: " + num);
	}
	

}






