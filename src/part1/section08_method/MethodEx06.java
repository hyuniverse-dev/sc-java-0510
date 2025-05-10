package part1.section08_method;
/*
 * getter와 setter 메서드
 * 	객체의 필드를 직접 접근하면 데이터 무결성이 깨질수 있음
 * 	필드 값의 유효성 검사 및 제한을 위해 필요
 * 	객체 지향 프로그래밍의 캡슐화(encapsulation) 구현
 * 
 * 	getter: 객체 필드 값을 반환하는 메서드(get필드명(), boolean 타입은 is필드명())
 *  setter: 객체 필드 값을 설정하는 메서드(set필드명(매개변수))
 *  
 *  일반적으로 필드를 private으로 선언하고 getter/setter를 public으로 선언
 *  
 *  
 *  접근 제한자의 종류
 *  	public: 모든 패키지, 모든 클래스 접근가능
 *  	protected: 같은 패키지, 상속관계 접근가능
 *  	default(지정안함): 같은 패키지 접근가능
 *  	private: 같은 클래스 내에서만 접근 가능
 * 
 * 
 */
public class MethodEx06 {
	
	public static void main(String[] args) {
		Person kim = new Person();

		kim.setAge(15);
		System.out.println(kim.getAge());
		
	}

}






















