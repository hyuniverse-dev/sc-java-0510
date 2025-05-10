package part1.section10_extends;

public class Bus extends Car {
	int pepleNum; // 승객 수
	
	Bus(int pepleNum) {
		super(6);
		this.pepleNum = pepleNum;	// 승객 수 초기화
		System.out.println("Bus 클래스 생성자 입니다.");
	}
	
	void takePerson() {
		System.out.println("승객이 버스에 탔습니다.");
		pepleNum++;
		System.out.println("지금까지 탑승한 승객은 " + pepleNum + "명입니다.");
	}

}
