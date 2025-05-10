package part1.section07_class;

public class ClassEx08 {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		Car2 c = new Car2();
		c.setColor("파란색");
		
		c = method1();
		System.out.println("c의 색상: " + c.color);
		
	}
	
	public static Car2 method1() {
		Car2 c2 = new Car2();
		c2.setColor("초록색");
		
		return c2;
	}

}





