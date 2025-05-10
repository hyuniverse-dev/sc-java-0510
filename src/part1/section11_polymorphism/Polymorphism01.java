package part1.section11_polymorphism;
/*
 * 다형성(Polymorphism)
 * 	하나의 타입으로 다양한 객체를 참조할 수 있는 능력
 * 	같은 메서드 호출로 다양한 실행 결과를 얻을 수 있음
 * 	객체 지향 프로그래밍의 핵심 특징 중 하나
 * 
 * 다형성의 구성 요소
 * 	상속: 클래스 간의 계층 구조 형성
 * 	메서드 오버라이딩: 자식 클래스에서 부모 메서드 재정의
 * 	타입변환: 자식 객체를 부모 타입으로 다루기
 * 
 * 다형성의 장점
 * 	코드의 유연성과 확장성 증가
 * 	유지보수 용이성 향상
 * 	객체간의 결합도 감소
 * 	새로운 클래스 추가시 기존 코드 수정 최소화
 * 
 * 타입 변환
 * 	자동타입변환(업캐스팅): 자식클래스 객체를 부모 타입 참조변수에 할당
 * 	강제타입변환(다운캐스팅): 부모 타입으로 변환된 자식 객체를 다시 자식 타입으로 변환
 * 
 * instanceof 연산자
 * 	객체가 특정 클래스의 인스턴스인지 확인하는 연산자
 * 	강제 타입 변환 전에 타입 확인을 위해 주로 사용
 * 	boolean 타입 결과 반환(true/false)
 * 
 * 	객체 instanceof 타입(클래스명)
 * 
 */

// 기본 동물 클래스
class Animal {
	void cry() {
		System.out.println("동물을 울음소릴 냅니다.");
	}	// 빈 메서드
}

// 돼지 클래스
class Pig extends Animal {
	
	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
	
	// Pig 클래스만의 고유 메서드
	void rollInMud() {
		System.out.println("돼지가 진흙 속에서 뒹굴고 있습니다.");
	}
	
}

// 소 클래스
class Cow extends Animal {
	
	@Override
	void cry() {
		System.out.println("음메");
	}
	
	// Cow 클래스만의 고유 메서드
	void produceMilk() {
		System.out.println("소가 우유를 생성합니다.");
	}
	
}

// 농장 클래스
class Farm {
	
	void sound(Animal animal) {	
		animal.cry();	// 다형성: 실제 객체 타입에 따라 다른 메서드 실행
		
		// 각 동물 타입에 따른 고유 기능 사용
		if(animal instanceof Pig) {
			Pig pig = (Pig)animal;
			pig.rollInMud();
		} else if(animal instanceof Cow) {
			Cow cow = (Cow)animal;
			cow.produceMilk();
		}
	}
	
}



public class Polymorphism01 {
	
	public static void main(String[] args) {
		Farm farm = new Farm();
		Pig pig = new Pig();
		Cow cow = new Cow();
		
		System.out.println("--- 돼지 소리 ---");
		farm.sound(pig);
		System.out.println("--- 소 소리 ---");
		farm.sound(cow);
		
	}

}















