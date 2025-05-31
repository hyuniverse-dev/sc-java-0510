package part2.section24_lambda;

public class Person2 {

    // 메소드명: action1, 반환타입: void, 매개변수: Workable2 타입의 workable
    // 실행부: workable 의 추상 메소드 호출
    public void action1(Workable2 workable) {
        workable.work("홍길동", "개발자");
    }

    // 메소드명: action2, 반환타입: void, 매개변수: Speakable 타입의 speakable
    // 실행부: speakable 의 추상 메소드 호출
    public void action2(Speakable speakable) {
        speakable.speak("Hello, World!");
    }
}
