package part2.section16_nested_class;

/*
    중첩클래스
        - 보통은 클래스가 다른 클래스와 관계를 맺는 경우 각 클래스를 독립적으로 사용하는 것이 좋으나
          특정한 경우에는 클래스를 분리하는 것보단 중첩된 구조로 작성하는게 유지보수성이 높아진다.
        - 클래스 내부에 또 다른 클래스가 선언된 형식을 얘기한다.

     중첩클래스 종류
        - 멤버 클래스: 클래스의 멤버로서 선언된 중첩 클래스 (인스턴스 클래스 | 정적 클래스)
        - 로컬 클래스: 메소드 내부에 선언된 중첩 클래스

    중첩클래스 사용 시 주의사항
        - 먼저 독립적인 클래스로 설계 후 필요에 의해 중첩된 구조로 변형(리팩토링)해 나간다.
 */
public class A {

    // 인스턴스 필드 값으로 B 객체를 대입
    B field = new B();

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }

    // 인스턴스 메소드
    void useB() {
        B b = new B();
        // b 인스턴스의 인스턴스 필드와 메소드 호출
        System.out.println(b.field1);
        b.method1();

        // B 클래스의 정적 필드와 정적 메소드 호출
        System.out.println(B.field2);
        B.method2();
    }

    // 분리된 C클래스 사용하기
    void useC() {
        C c = new C();

        System.out.println(c.field1);
        c.method1();

        System.out.println(C.field2);
        C.method2();
    }

    // 멤버 클래스
    class B {
        // 인스턴스 필드
        int field1 = 1;

        // JDK 17 이상부터는 정적 필드(static)
        static int field2 = 2;

        // 인스턴스 메소드
        void method1() {
            System.out.println("중첩된 B클래스의 method1 입니다.");
        }

        // JDK 17 이상부터는 정적 메소드(static)
        static void method2() {
            System.out.println("중첩된 B클래스의 정적 method2 입니다.");
        }
    }
}
