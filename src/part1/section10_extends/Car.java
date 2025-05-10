package part1.section10_extends;

public class Car {
	
	int wheel;
	
	Car() {
		System.out.println("Car클래스 생성자 입니다.");
	}
	
	Car(int wheel) {
		this.wheel = wheel;
		System.out.println("Car(int wheel)클래스 생성자 입니다.");
	}
	
	void ride() {
		System.out.println("달립니다.");
	}

}










