package part1.section07_class;

public class Car2 {
	
	int wheel;
	String color;
	static String brand;
	
	// 생성자 - 클래스와 동일한 이름
	Car2() {
		wheel = 4;
		color = "빨간색";
		brand = "테슬라";
		System.out.println("Car2 객체가 생성되었습니다.");
	}
	
	
	// 메서드 선언
	void ride()	{
		System.out.println("달립니다.");
		System.out.println("씽씽씽");
	}
	
	// 매개변수가 있는 메서드
	void setColor(String newColor) {	// String newColor = "파란색";
		color = newColor;
		System.out.println("색상을 " + newColor + "으로 변경했습니다.");
	}
	
	// 반환값이 있는 메서드
	int getWheelCount() {
		return wheel;
	}

}









