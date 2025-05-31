package part2.section24_lambda;

@FunctionalInterface
public interface Speakable {
    // 추상 메소드 선언
    // 메소드명: speak, 반환 타입: void, 매개변수: String 타입의 content
    void speak(String content);
}
