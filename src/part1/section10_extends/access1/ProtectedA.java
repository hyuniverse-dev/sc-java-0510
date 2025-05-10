package part1.section10_extends.access1;

public class ProtectedA {
	protected int a;
	
	protected ProtectedA(int a) {
		this.a = a;
	}
	
	protected void printA() {
		System.out.println("ProtectedA 클래스 printA 메서드 입니다.");
	}
}
