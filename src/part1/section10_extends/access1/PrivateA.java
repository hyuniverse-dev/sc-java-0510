package part1.section10_extends.access1;

public class PrivateA {
	
	private int a;
	
	private PrivateA(int a) {
		this.a = a;
	}
	
	public static PrivateA getInstance() {
		return new PrivateA(13);
	}
	
	private void printA() {
		System.out.println("PrivateA 클래스 printA 메서드 입니다.");
	}

}
