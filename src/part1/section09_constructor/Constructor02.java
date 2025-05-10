package part1.section09_constructor;
/*
 * 생성자 오버로딩
 * 	하나의 클래스에 여러 개의 생성자 정의 기법
 * 	매개변수 타입, 개수, 순서 달리하여 다양한 객체 생성가능
 * 
 * this 예약어
 * 	객체가 자기자신을 참조할 때 사용하는 예약어
 * 	객체의 필드와 매개변수 이름이 동일할 때 구분하기위해 사용
 * 	인스턴스 멤버임을 명확히 하기 위해 사용
 * 
 */
public class Constructor02 {
	
	public static void main(String[] args) {
		
		
		
		Snack2 snack = new Snack2(2000);
		Snack2 snack2 = new Snack2(5000);
		Snack2 snack3 = new Snack2();
		
		// snack.price = 2000;
		snack.info();
		snack2.info();
		snack3.info();
		
		
		
	}

}
