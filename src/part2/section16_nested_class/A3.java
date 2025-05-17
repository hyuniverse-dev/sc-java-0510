package part2.section16_nested_class;

/*
    로컬 클래스
        - 생성자 또는 메소드 내부에 선언된 클래스를 로컬 클래스라고 한다.
        - 로컬 클래스는 생성자 또는 메소드가 실행될 동안에만 객체를 생성한다.
 */
public class A3 {

    // 인스턴스 메소드
    void method1() {

        // 로컬 클래스 (메소드 내부에 정의)
        class C {

        }
    }
}
