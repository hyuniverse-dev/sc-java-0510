package part2.section15_interface;

public class Audio implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }
}
