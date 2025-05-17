package part2.section18_anonymous;

/*
    익명 객체(Anonymous Object)
        - 이름이 없는 개체를 말한다.
        - 명시적으로 클래스를 선언하지 않기 때문에 쉽게 객체를 생성할 수 있다.
        - 일회성이다.

    익명 객체 특징
        - 익명 객체는 클래스를 상속하거나 인터페이스를 구현해야지만 사용이 가능합니다.
        - 클래스를 상속해 만들 경우 '익명 자식 객체'라고 한다.
        - 인터페이스를 구현해서 만들 경우 '익명 구현 객체'라고 한다.
 */

public class Tire {

    public void roll() {
        System.out.println("일반 타이어가 굴러갑니다.");
    }
}
