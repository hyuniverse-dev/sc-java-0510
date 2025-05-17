package part2.section16_nested_class;
/*
    중첩클래스 사용하기
        - 인스턴스 클래스 B를 사용하려면 A 객체를 먼저 생성한 다음 B 객체를 생성해야 합니다.
 */
public class AEx {
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        A.B field = a.field;

        // B 객체 생성
        // B b = new B(); -> 컴파일 에러 발생 (A 클래스와 무관하게 접근 불가능)
        A.B b = a.new B();

        // A 객체의 useB() 메소드 호출
        a.useB();
    }
}
