package part2.section15_interface;

public class SmartTelevisionImpl2 implements SmartTelevision {
    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 을 검색합니다.");
    }
}
