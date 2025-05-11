package part2.section15_interface;

public class InterfaceExtendsEx {
    public static void main(String[] args) {
        // InterfaceA 와 InterfaceB 를 상속받은 InterfaceC 를 사용한다.
        InterfaceC c = new InterfaceCImpl();
        c.methodA();
        c.methodB();
        c.methodC();
        
        // 구현체를 InterfaceA(부모 인터페이스) 타입에 대입
        InterfaceA interfaceA = c;
        interfaceA.methodA();
        // interfaceA.methodB(); -> InterfaceA 에 정의되지 않은 추상 메소드는 호출 불가.
        
    }
}
