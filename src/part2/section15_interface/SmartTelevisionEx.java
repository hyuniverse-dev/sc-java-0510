package part2.section15_interface;

public class SmartTelevisionEx {
    public static void main(String[] args) {
        // 인터페이스 다중 구현
        RemoteControl2 rc = new SmartTelevisionImpl();

        // RemoteControl2 인터페이스의 추상 메소드 호출
        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스의 추상 메소드 호출
        Searchable rc2 = new SmartTelevisionImpl();
        rc2.search("https://naver.com");

        // 인터페이스 상속 사용
        SmartTelevision rc3 = new SmartTelevisionImpl2();
        rc3.turnOn();
        rc3.search("https://kakao.com");
        rc3.turnOff();

    }
}
