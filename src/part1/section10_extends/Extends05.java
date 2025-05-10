package part1.section10_extends;

import part1.section10_extends.access1.ProtectedA;
import part1.section10_extends.access1.PublicA;

/*
 * 접근 제한자(Access Modifier)
 * 	클래스, 변수, 메서드, 생성자 등의 접근 범위를 제한하는 키워드
 * 	데이터 은닉과 보안을 위해 중요한 역할
 * 	객체 지향 프로그래밍의 캡슐화를 구현하는 방법
 * 
 * 접근 제한자의 종류
 * 	public: 모든 패키지, 모든 클래스에서 접근 가능
 * 	protected: 같은 패키지 내 + 다른 패키지의 자식 클래스에서 접근 가능
 * 	default(지정안함): 같은 패키지 내에서 접근 가능
 * 	private: 같은 클래스 내에서만 접근 가능
 * 
 * 
 */
public class Extends05 extends ProtectedA {
	
	protected Extends05(int a) {
		super(a);
	}
	
	public void printProtectedA() {
		super.printA();
	}
	

	public static void main(String[] args) {
		
		PublicA publicA = new PublicA(10);
		System.out.println("publicA.a: " + publicA.a);
		publicA.printA();
		
		// ProtectedA protectedA = new ProtectedA(11);
		
		// DefaultA defaultA = new DefaultA(12);
		
		// PrivateA privateA = new PrivateA(13); 
		
		
	}

}
















