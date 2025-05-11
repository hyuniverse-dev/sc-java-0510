package part2.section15_interface;

/*
    인터페이스 상속
        - 일반 클래스와 달리 다중 상속을 허용한다.
        - extends 키워드를 사용한다.
        - 자식 인터페이스의 구현체는 부모 인터페이스의 추상 메소드까지 모두 구현한다.
        - 자식 인터페이스의 구현체는 부모 인터페이스 타입의 변수에 대입 가능하다.
          단, 부모 인터페이스에 선언되어 있는 추상 메소드만 호출이 가능하다.
 */
public interface InterfaceC extends InterfaceA, InterfaceB {
    // 추상 메소드
    void methodC();
}
