package part2.section21_generic;

/*
    - T는 타입 파라미터를 뜻한다.
    - 현재 Box 클래스는 T가 무엇인지 모르지만, Box 객체가 생성될 시점에 전달받는 타입으로 대체된다고 인식한다.
    - 만약 Box 의 내용물로 String 을 저장하고 싶다면 타입 파라미터를 String 타입으로 전달받으면 된다.
    - 타입 파라미터에 사용하는 T는 단지 이름일 뿐이기 때문에 T 대신에 A부터 Z까지 어떤 알파벳을 사용해도 상관없다.

    주의할 점
        - 타입 파라미터는 클래스 또는 인터페이스 타입으로만 대체가 가능하다.
        - 따라서 기본형(primitive type)은 사용이 불가능하다. 예시 -> Box<int> 는 안된다.
 */
public class Box<T> {

    public T content;
}
