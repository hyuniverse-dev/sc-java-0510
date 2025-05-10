package part1.section09_constructor;

public class Snack2 {
	int price;
	
	Snack2(){
		price = 1500;
	}
	
	// 생성자 오버로딩
	Snack2(int price){
		this.price = price;
		
		System.out.println("Snack2 객체 생성!");
	}
	
	void info() {
		System.out.println("과자의 가격은 " + price + "입니다.");
	}

}
