package part2.section15_interface;

public class SmartTelevisionEx {
    public static void main(String[] args) {
        RemoteControl2 rc = new SmartTelevisionImpl();

        // RemoteControl2 인터페이스의 추상 메소드 호출
        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스의 추상 메소드 호출
        Searchable rc2 = new SmartTelevisionImpl();
        rc2.search("https://naver.com");

    }
}
