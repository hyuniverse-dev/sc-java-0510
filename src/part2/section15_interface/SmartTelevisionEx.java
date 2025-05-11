package part2.section15_interface;

/*
    노션: [다중 인터페이스 구현] https://hyuniverse-space.notion.site/1222c9c18dcc80edb71eed60f3478bfd?pvs=4
         [인터페이스 상속] https://hyuniverse-space.notion.site/1222c9c18dcc80198a4cd863d1d05900?pvs=4
 */
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

        // 타입 캐스팅 적용하기
        Searchable rc4 = (Searchable) rc;
        rc4.search("https://github.com");

    }
}
