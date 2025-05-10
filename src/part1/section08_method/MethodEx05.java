package part1.section08_method;
/*
 * return문의 특징
 * 	1. 반환 타입과 일치하는 값 또는 표현식만 반환가능
 * 	2. 자동 형변환이 가능한 타입은 반환 가능
 * 	3. 메서드를 즉시 종료시키는 효과가 있음
 * 
 */

class Bus {
	void take(int m) {
		while(true) {
			if(m < 3000) {
				System.out.println("교통카드를 충전하러 갑니다.");
				return;
			}
			
			System.out.println("버스를 탑니다.");
			m -= 1250;
		}
	}
}

public class MethodEx05 {
	
	public static void main(String[] args) {
		
		int money = 10000;
		
		Bus bus = new Bus();	// 버스객체 생성
		bus.take(money);		// 버스 인스턴스의 take 메서드 호출

		
		short num = (short) getNum();
		
	}
	
	static int getNum() {
		return 500000;
	}

}













