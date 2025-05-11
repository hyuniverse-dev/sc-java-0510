package part2.section15_interface;

public class InterfaceCImpl implements InterfaceC{
    @Override
    public void methodC() {
        System.out.println("methodC가 실행되었습니다.");
    }

    @Override
    public void methodA() {
        System.out.println("methodA가 실행되었습니다.");
    }

    @Override
    public void methodB() {
        System.out.println("methodB가 실행되었습니다.");
    }
}
