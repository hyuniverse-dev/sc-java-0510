package part2.section15_interface;

/*
    인터페이스 사용
        - 인터페이스도 하나의 타입으로 사용한다.
        - 특정 인터페이스를 구현한 구현체들은 해당 인터페이스 타입으로 사용이 가능하다. (자동형변환/promotion)
        - 필요한 시점에 다른 리모콘을 생성하여 사용할 수 있다.
        - 하지만 실제로 RemoteControlEx 객체에서는 RemoteControl 인터페이스만 참조하는 것이다.
 */
public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(12);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        /// TV 리모콘에서 9번 라인 이후부터는 Audio 리모콘으로 사용한다.
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(-1);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        // 변수 선언과 초기화를 동시에 해도 된다.
        RemoteControl rc2 = new Television();

        // 인터페이스 상수 필드에 접근
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        // 인터페이스 정적 메소드 호출
        RemoteControl.changeBattery();
    }
}
